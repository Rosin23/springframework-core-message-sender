package com.nhnacademy.edu.springframework.mains;

import com.nhnacademy.edu.springframework.User;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.nhnacademy.edu.springframework");
        User user = new User("냥", "111", "aaa");
        String message = "펀치";
        MessageSendService messageSendService = context.getBean("messageSendService", MessageSendService.class);
        messageSendService.doSendMessage(user, message);
    }
}