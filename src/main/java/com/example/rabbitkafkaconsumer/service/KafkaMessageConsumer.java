package com.example.rabbitkafkaconsumer.service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.rabbitkafkaconsumer.model.Message;

@Service
public class KafkaMessageConsumer {

    @KafkaListener(topics = "jsonTopic", groupId = "grupo-mensagens", containerFactory = "mensagemKafkaListenerFactory")
    public void consumir(Message mensagem) {
        System.out.println("Mensagem recebida:");
        System.out.println("ID: " + mensagem.getMensagemId());
        System.out.println("Conteúdo: " + mensagem.getMessage());
    }
}