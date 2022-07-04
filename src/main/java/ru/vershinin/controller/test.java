package ru.vershinin.controller;

import ru.vershinin.dto.MessageDto;

import java.text.MessageFormat;

public class test {
    public static void main(String[] args) {

        MessageDto messageDto = new MessageDto();
        messageDto.setTopic("test");
        messageDto.setStatus("OK");
        messageDto.setClient("6");
        messageDto.setComment("test");
        messageDto.setState("false");
        messageDto.setResponsibleUser("5");
        messageDto.setLinkToSugar("link");

        new test().test(messageDto);


    }

    public void test(MessageDto messageDto) {


        String message = MessageFormat.format("hello {0} \n trtr {1}\n{2}\n{3}\n{4}\n\n" +
                        "\n Пожалуйста, не отвечайте на это письмо, так как оно сформировано автоматически.",
                messageDto.getTopic(), messageDto.getStatus(), messageDto.getComment(), messageDto.getComment(), messageDto.getState());

        System.out.println(message);
    }

}
