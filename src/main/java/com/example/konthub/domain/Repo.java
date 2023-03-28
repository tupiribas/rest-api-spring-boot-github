package com.example.konthub.domain;

//import java.util.List;

public class Repo {
	private Integer id;
	private String name;
	private String description;
	private String full_name;
	private User owner;
	private String url;
	private String visibility;
	private String pushed_at;
	private String created_at;
	private String language;

	public String getLinguagem() {
		return language;
	}
	public void setLinguagem(String language) {
		this.language = language;
	}
	public String getData_criacao() {
		return created_at;
	}
	public void setData_criacao(String created_at) {
		this.created_at = created_at;
	}
	public String getData_push() {
		return pushed_at;
	}
	public void setPData_push(String pushed_at) {
		this.pushed_at = pushed_at;
	}
	public String getDescricao() {
		return description;
	}
	public void setDescricao(String description) {
		this.description = description;
	}
	public String getVisibilidade() {
		return visibility;
	}
	public void setVisibilidade(String visibility) {
		this.visibility = visibility;
	}
	public User getUsuario() {
		return owner;
	}
	public void setUsuario(User owner) {
		this.owner = owner;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getNome_completo() {
		return full_name;
	}
	public void setNome_completo(String full_name) {
		this.full_name = full_name;
	}
	public String getNome_projeto() {
		return name;
	}
	public void setNome_projeto(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	

}
