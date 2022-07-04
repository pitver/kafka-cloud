package ru.vershinin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vershinin.dto.MessageDto;
import ru.vershinin.service.ProducerService;

@RestController
@RequestMapping("/test")
public class TestController {
    private final ProducerService service;

    public TestController(ProducerService service) {
        this.service = service;
    }

    @GetMapping()
    public String test(){
        MessageDto messageDto= new MessageDto();
        messageDto.setTopic("test");
        messageDto.setStatus("OK");
        messageDto.setClient("6");
        messageDto.setComment("test");
        messageDto.setState("false");
        messageDto.setResponsibleUser("5");
        messageDto.setLinkToSugar("link");
       // service.createMessage(messageDto);
        service.produceHotDrinks();
        service.produceItem();
        return "ok";
    }
}
