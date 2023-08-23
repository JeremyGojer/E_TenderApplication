package com.DataApi1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.DataApi1.beans.SearchDTO;
import com.DataApi1.service.SearchService;

@Controller
public class SearchController {
	
	@Autowired
	SearchService ss;
	
	@PostMapping("/all")
	public ResponseEntity<?> allData(){
		return ResponseEntity.ok(ss.getAllData());
	}
	
	@PostMapping("/defaultSearch1")
	public ResponseEntity<?> defaultSearch1(@RequestBody SearchDTO data){
		return ResponseEntity.ok(ss.getByTenderName(data.getTenderName()));
	}
	
	@PostMapping("/defaultSearch2")
	public ResponseEntity<?> defaultSearch2(@RequestBody SearchDTO data){
		return ResponseEntity.ok(ss.getByTenderLocation(data.getTenderLocation()
				));
	}
	
	@PostMapping("/defaultSearch3")
	public ResponseEntity<?> defaultSearch3(@RequestBody SearchDTO data){
		return ResponseEntity.ok(ss.getByTenderCategory(data.getTenderCategory()
				));
	}
	
	@PostMapping("/advancedSearch")
	public ResponseEntity<?> advancedSearch(@RequestBody SearchDTO data){
		return ResponseEntity.ok(ss.advancedSearch1(data.getTenderLocation(), data.getTenderCategory(), data.getlPrice(), data.gethPrice()));
	}
	
}
