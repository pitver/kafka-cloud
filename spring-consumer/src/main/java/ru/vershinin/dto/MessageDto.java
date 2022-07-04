package ru.vershinin.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor
public class MessageDto {

    private String topic;
    private String status;
    private String client;
    private String comment;
    private String state;
    private String responsibleUser;
    private String linkToSugar;

    public MessageDto(String topic, String status, String client, String comment, String state, String responsibleUser, String linkToSugar) {
        this.topic = topic;
        this.status = status;
        this.client = client;
        this.comment = comment;
        this.state = state;
        this.responsibleUser = responsibleUser;
        this.linkToSugar = linkToSugar;
    }
}
