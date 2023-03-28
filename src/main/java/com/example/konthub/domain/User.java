package com.example.konthub.domain;

public class User {
	private Integer id;
	private String name;
	private String login;
	private String avatar_url;
	private String location;
	private String bio;
	
	public String getAvatar_url() {
		return avatar_url;
	}
	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String nome) {
		this.login = nome;
	}
	public String getLocalizacao() {
		return location;
	}
	public void setLocalizacao(String location) {
		this.location = location;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
