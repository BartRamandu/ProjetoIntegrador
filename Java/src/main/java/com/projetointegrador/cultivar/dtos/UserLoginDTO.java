package com.projetointegrador.cultivar.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 
 * @author marianatheml
 * @version 1.0
 *
 */

public class UserLoginDTO {
	
	@NotBlank(message = "Insert valid username")
	private String usuario;
	
	@NotBlank(message = "Insert valid password")
	@Size(min = 8, max = 20)
	private String senha;

	private String token;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
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
