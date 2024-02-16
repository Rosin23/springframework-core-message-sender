package com.nhnacademy.edu.springframework.mains;

import com.nhnacademy.edu.springframework.MessageSender;
import com.nhnacademy.edu.springframework.sender.DoorayMessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.nhnacademy.edu.springframework"})
public class JavaConfig {
    @Bean("messageSendService")
    public MessageSendService messageSendService() {
        return new MessageSendService(doorayMessageSender());
    }
    @Bean("doorayMessageSender")
    public MessageSender doorayMessageSender() {
        return new DoorayMessageSender();
    }



}
