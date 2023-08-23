package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Users;
import com.example.demo.service.UsersService;

@RestController
public class UsersController {
	
	@Autowired
	UsersService usersService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Users>> getAllUsers(){
		System.out.println(usersService.getAllUsers());
		return ResponseEntity.ok(usersService.getAllUsers());
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Users users){
		return ResponseEntity.ok(usersService.Login(users.getUsername(), users.getPassword()));
	}
	
	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody Users users){
		return ResponseEntity.ok(usersService.register(users));
	}
	
}
