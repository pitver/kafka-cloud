package ru.vershinin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.util.UUID;

@EnableBinding({CustomSource.class})
@Component
public class ProducerService {


    @Autowired
    private CustomSource source;


    public void produceHotDrinks() {
        source.output1().send(MessageBuilder.withPayload(UUID.randomUUID().toString()).build());
    }


    public void produceItem() {
        source.output2()
                .send(MessageBuilder.withPayload(UUID.randomUUID().toString()).build());

    }


}
