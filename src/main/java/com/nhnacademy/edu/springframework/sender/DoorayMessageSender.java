package com.nhnacademy.edu.springframework.sender;

import com.nhn.dooray.client.DoorayHook;
import com.nhn.dooray.client.DoorayHookSender;
import com.nhnacademy.edu.springframework.MessageSender;
import com.nhnacademy.edu.springframework.User;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DoorayMessageSender implements MessageSender {
    @Override
    public void sendMessage(User user, String message) {
        new DoorayHookSender(new RestTemplate(), "https://hook.dooray.com/services/3204376758577275363/3738651962004364986/HByzZBRuRu69-EUTsWR0tg")
                .send(DoorayHook.builder()
                        .botName(user.getName())
                        .text(message)
                        .build());
    }
}
