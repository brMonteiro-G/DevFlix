package com.projeto.challenge.alura.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.challenge.alura.repository.VideoRepository;

@Service
public class VideoService {
	
	@Autowired
	private VideoRepository Videorepository; 

	public int metodoTeste(String titulo) {
		// TODO Auto-generated method stub
		return 10;
	}

	
	
}
