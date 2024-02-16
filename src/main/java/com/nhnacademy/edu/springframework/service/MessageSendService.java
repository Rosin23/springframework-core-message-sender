package com.nhnacademy.edu.springframework.service;


import com.nhnacademy.edu.springframework.MessageSender;
import com.nhnacademy.edu.springframework.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class MessageSendService {
    private MessageSender messageSender;

    @Autowired
    public MessageSendService( MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage(User user, String message){
        this.messageSender.sendMessage(user, message);
    }
}

