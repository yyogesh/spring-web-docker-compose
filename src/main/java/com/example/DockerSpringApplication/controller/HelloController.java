package com.example.DockerSpringApplication.controller;

import com.example.DockerSpringApplication.model.Message;
import com.example.DockerSpringApplication.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    MessageRepository messageRepository;

    @GetMapping("/")
    public String hello() {
        return "Hello docker";
    }

    @GetMapping("/messages")
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    @PostMapping("/message")
    public String saveMessages(@RequestBody Message message) {
         messageRepository.save(message);
         return "scuess";
    }

}
