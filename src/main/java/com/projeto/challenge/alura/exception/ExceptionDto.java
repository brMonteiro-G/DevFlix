package com.projeto.challenge.alura.exception;

public class ExceptionDto {
	
	private String campo; 
	
	private String log;

	public ExceptionDto(String campo, String log) {
		super();
		this.campo = campo;
		this.log = log;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	} 
	

		
	
}
