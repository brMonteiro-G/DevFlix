package com.projeto.challenge.alura.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.challenge.alura.model.VideoModel;
import com.projeto.challenge.alura.repository.VideoRepository;
import com.projeto.challenge.alura.service.VideoService;

@RestController
@CrossOrigin("*")
@RequestMapping("/videos")
public class VideoController {

	@Autowired
	private VideoRepository repository; 
	
	//@Autowired
	//private VideoModel video pq não funciona ? 
	
	@Autowired
	private VideoService service; 
	
	@GetMapping("{id}")
	public ResponseEntity<VideoModel> getById(@PathVariable Long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<VideoModel> postVideo(@RequestBody @Valid VideoModel video){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(video));
	}
	
}
