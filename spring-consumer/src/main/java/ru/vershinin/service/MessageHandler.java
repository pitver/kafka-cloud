package ru.vershinin.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import ru.vershinin.dto.MessageDto;

@EnableBinding(CustomChannels.class)
public class MessageHandler {

    private static final Logger logger = LoggerFactory.getLogger(MessageHandler.class);

    @StreamListener("inboundOrgChanges")
    public void loggerSink(String message) {
        logger.info("message {}",message);
    }

    @StreamListener("inboundOrg")
    public void loggerSink1(String message) {
        logger.info("message {}",message);
    }
}
