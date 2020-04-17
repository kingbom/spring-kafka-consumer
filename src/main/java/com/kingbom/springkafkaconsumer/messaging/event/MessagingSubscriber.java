package com.kingbom.springkafkaconsumer.messaging.event;

import com.kingbom.springkafkaconsumer.messaging.binding.MessagingBinding;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MessagingSubscriber {

    @StreamListener(MessagingBinding.INPUT)
    public void subscriberMessagingEvent(Message<MessagingEvent> message) {
        log.debug("subscriberMessagingEvent ... :{}", message);
    }
}
