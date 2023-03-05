package com.example.konthub.control;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.konthub.domain.Repo;
import com.example.konthub.domain.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@RestController
public class UserController {
	private static final String API_BASE_URL = "https://api.github.com/";
	
	@GetMapping("/users/{username}")
	public User getUser(@PathVariable String username) throws IOException {
		OkHttpClient client = new OkHttpClient();
		
		Request request = new Request.Builder()
				.url(API_BASE_URL + "users/" + username).build();
		
		try (Response response = client.newCall(request).execute()){
			String responseBody = response.body().string();
			
			Gson gson = new Gson();
			User user = gson.fromJson(responseBody, User.class);			
			return user;
		}
		catch (IOException e) {
			throw new IOException("Erro ao tentar buscar usuário.");
		}
	}
	
	@GetMapping("/users/{username}/repos")
	public List<Repo> getReposByUser(@PathVariable String username) throws IOException {
		OkHttpClient client = new OkHttpClient();
		
		Request request = new Request.Builder()
				.url(API_BASE_URL + "users/" + username + "/repos").build();
		
		try (Response response = client.newCall(request).execute()){
			String responseBody = response.body().string();
			
			Gson gson = new Gson();
			Type repoListType = new TypeToken<List<Repo>>(){}.getType();
			List<Repo> repos = gson.fromJson(responseBody, repoListType);			
			return repos;
		}
		catch (IOException e) {
			throw new IOException("Erro ao tentar buscar repositório.");
		}
	}
}
