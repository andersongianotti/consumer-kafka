package com.example.rabbitkafkaconsumer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "messages")
public class Message {
	@Id
	private String id;
	private String mensagemId;
	private String message;

	// Getters e Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
