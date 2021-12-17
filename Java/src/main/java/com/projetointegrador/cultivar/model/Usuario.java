package com.projetointegrador.cultivar.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author marianatheml
 * @author bartramandu
 * @author pedro
 * @author JadyLinnit
 * @since 1.5
 * 
 */

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Digite um nome.")
	@Size(min = 2, max = 100)
	private String nome;

	@ApiModelProperty(example = "email@email.com.br")
	@NotBlank(message = "Digite um e-mail.")
	@Email
	@Size(min = 5, max = 100)
	private String email;
	
	@Size(min = 5, max = 200, message = "O atributo foto recebe link onde uma imagem em um banco de dados existe.")
	private String foto;
	
	@Size(min = 5, max = 100, message = "O atributo tipo tem de ter no mínimo 05" + " e no máximo 100 caracteres.")
	private String tipo;

	@NotBlank
	@Size(min = 8, max = 150)
	private String senha;

	@OneToMany(mappedBy = "criador", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("criador")
	private List<Produto> meusProdutos;
	
	public Usuario(Long id,String nome,String email,String foto,String tipo,String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.foto = foto;
		this.tipo = tipo;
		this.senha = senha;
	}
	
	public Usuario() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Produto> getMeusProdutos() {
		return meusProdutos;
	}

	public void setMeusProdutos(List<Produto> meusProdutos) {
		this.meusProdutos = meusProdutos;
	}

}
