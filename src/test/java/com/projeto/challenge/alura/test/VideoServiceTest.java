package com.projeto.challenge.alura.test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.projeto.challenge.alura.service.VideoService;

@RunWith(SpringRunner.class)
public class VideoServiceTest {
	
	@TestConfiguration
	public static class VideoServiceConfiguration{
		
		@Bean
		public 	VideoService videoService() {
			return new VideoService();
		}
	}

	
	@Autowired
	VideoService videoService; 
	
	@Test
	public void videoTest() {
		
		String titulo = "tdd"; 
		int descricao = videoService.metodoTeste(titulo);
		
		Assertions.assertEquals(descricao, 10);
	}
	
	
}
