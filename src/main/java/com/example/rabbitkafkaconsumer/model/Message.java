package com.example.rabbitkafkaconsumer.model;

public class Message {
	private String mensagemId;
	private String message;

	// Getters e Setters
	public String getMensagemId() {
		return mensagemId;
	}

	public void setMensagemId(String mensagemId) {
		this.mensagemId = mensagemId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
