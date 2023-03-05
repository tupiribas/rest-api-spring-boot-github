package com.example.konthub.domain;

public class User {
	private String id;
	private String login;
	private String avatar_url;
	
	public String getAvatar_url() {
		return avatar_url;
	}
	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return login;
	}
	public void setNome(String nome) {
		this.login = nome;
	}
}
