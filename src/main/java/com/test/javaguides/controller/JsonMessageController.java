package com.test.javaguides.controller;

import com.test.javaguides.kafka.JsonKafkaProducer;
import com.test.javaguides.payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    private JsonKafkaProducer kafkaProducer;

    public JsonMessageController(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("publish")
    public ResponseEntity<String> publish(@RequestBody User user) {
         kafkaProducer.sendMessage(user);
         return ResponseEntity.ok("json message sent to kafka topic. ");
    }
}
