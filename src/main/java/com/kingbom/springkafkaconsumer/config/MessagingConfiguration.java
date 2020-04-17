package com.kingbom.springkafkaconsumer.config;

import com.kingbom.springkafkaconsumer.messaging.binding.MessagingBinding;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(value = { MessagingBinding.class })
public class MessagingConfiguration {
}
