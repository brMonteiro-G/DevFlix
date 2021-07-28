package com.projeto.challenge.alura.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public List<ExceptionDto> handler(MethodArgumentNotValidException exception) {
		
		List<ExceptionDto> dto = new ArrayList<>();
		
		List<FieldError> fieldError = exception.getBindingResult().getFieldErrors();
		
		fieldError.forEach(s -> {
			        String log = s.getDefaultMessage(); 
					ExceptionDto error = new ExceptionDto(s.getField(), log) ;
					dto.add(error);
		});

		return dto;
	}
	
}
