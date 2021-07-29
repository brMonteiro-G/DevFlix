package com.projeto.challenge.alura.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.projeto.challenge.alura.model.VideoModel;


@SpringBootTest
@AutoConfigureMockMvc
public class VideoControllerTest {

	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	 MockMvc mock;
	
	@Test
	public void videoTestGetAll() throws Exception {
		mock.perform(get("/videos")).andExpect(status().isOk());
	}
	
	
	@Test
	public void VideoTestPost() throws Exception {
		
		VideoModel video = new VideoModel();
		video.setTitulo("Eu sou a lenda");
		video.setDescricao("Filme de ação");
		video.setUrl("www.teste.com");
		video.setId(1L);
		
		((ResultActions) ((MockHttpServletRequestBuilder) mock.perform(post("/videos/upload")))
		
		.contentType("application/json")
		
		.content(objectMapper.writeValueAsString(video)))

		.andExpect(status().isOk());
		
	}
}
