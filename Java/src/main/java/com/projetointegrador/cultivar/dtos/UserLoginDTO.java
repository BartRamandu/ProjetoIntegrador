package com.projetointegrador.cultivar.dtos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 
 * @author marianatheml
 * @author bartramandu
 * @version 1.1
 *
 */

public class UserLoginDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Digite um nome.")
	@Size(min = 2, max = 50, message = "Seu nome deve conter de 2 a 50 caracteres.")
	private String nome;
	
	@NotBlank(message = "Digite um e-mail.")
	@Email(message = "Digite um e-mail válido.")
	private String email;
	
	@Size(min = 5, max = 200, message = "O atributo foto recebe link onde uma imagem em um banco de dados existe.")
	private String foto;
	
	@Size(min = 5, max = 100, message = "O atributo tipo tem de ter no mínimo 05" + " e no máximo 100 caracteres.")
	private String tipo;
	
	@NotBlank(message = "Digite uma senha.")
	@Size(min = 8, max = 20, message = "Sua senha deve conter no mínimo 8 caracteres (até 20).")
	private String senha;
	
	private String token;

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

	public void setEmail(String usuario) {
		this.email = usuario;
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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
