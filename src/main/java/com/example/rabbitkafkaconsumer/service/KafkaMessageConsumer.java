package com.example.rabbitkafkaconsumer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.rabbitkafkaconsumer.model.Message;
import com.example.rabbitkafkaconsumer.repository.MessageRepository;

@Service
public class KafkaMessageConsumer {

    @Autowired
    private MessageRepository messageRepository;

    @KafkaListener(topics = "jsonTopic", groupId = "grupo-mensagens", containerFactory = "mensagemKafkaListenerFactory")
    public void consumir(Message mensagem) {
        System.out.println("Mensagem recebida:");
        System.out.println("ID: " + mensagem.getMensagemId());
        System.out.println("Conteúdo: " + mensagem.getMessage());
        
        messageRepository.save(mensagem);
        System.out.println("Mensagem salva no MongoDB");
    }
}