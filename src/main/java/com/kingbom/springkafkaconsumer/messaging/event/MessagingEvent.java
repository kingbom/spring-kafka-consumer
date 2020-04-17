package com.kingbom.springkafkaconsumer.messaging.event;

import com.kingbom.springkafkaconsumer.messaging.payload.MessagingPayload;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessagingEvent {
    private String eventId;
    private EventAction action;
    private MessagingPayload data;
}
