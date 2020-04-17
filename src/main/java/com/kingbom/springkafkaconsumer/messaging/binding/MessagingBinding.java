package com.kingbom.springkafkaconsumer.messaging.binding;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface MessagingBinding {

    String INPUT = "messagingInput";

    @Input(INPUT)
    MessageChannel messagingInput();
}
