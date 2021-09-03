package com.bolsadeideas.springboot.form.app.models.domain;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.bolsadeideas.springboot.form.app.validations.IdentificadorRegex;
import com.bolsadeideas.springboot.form.app.validations.Requerido;

public class Usuario {
    
	//@NotEmpty
	private String nombre;
	//@NotEmpty
	@Requerido
	private String apellido;
	//@Pattern(regexp = "[0-9]{2}[.,][\\d]{3}[.][\\d]{3}[-][A-Z]{1}")
	@IdentificadorRegex
	private String identificador;
	@NotBlank
	@Size(min = 3)
	private String username;
	@NotEmpty
	private String password;
	@NotEmpty
	@Email(message = "Formato invalido")
	private String email;
	
	@NotNull
	@Min(5)
	@Max(5000)
	private Integer cuenta;
	
	@NotNull //NotNull porque es un objeto
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Future
	private Date fechaNacimiento;
	
	//@NotEmpty  notempty es porque es un string
	//@Valid //para validar objetos relacionados
	@NotNull
	private Pais pais;
	
	@NotEmpty
	private List<Roles>roles;
	
	private Boolean habilitar;
	
	private String genero;
	
	private String valorSecreto;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public Integer getCuenta() {
		return cuenta;
	}
	public void setCuenta(Integer cuenta) {
		this.cuenta = cuenta;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public List<Roles> getRoles() {
		return roles;
	}
	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}
	public Boolean getHabilitar() {
		return habilitar;
	}
	public void setHabilitar(Boolean habilitar) {
		this.habilitar = habilitar;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getValorSecreto() {
		return valorSecreto;
	}
	public void setValorSecreto(String valorSecreto) {
		this.valorSecreto = valorSecreto;
	}	
	
	
}
