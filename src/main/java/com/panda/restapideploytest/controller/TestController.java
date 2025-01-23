package com.panda.restapideploytest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class TestController {
    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("All functionality work...");
    }

    @GetMapping("/telegram/webhook/handler")
    public ResponseEntity<String> telegramWebhookHandler() {
        System.out.println("Webhook works...");
        return ResponseEntity.ok("Telegram webhook works fine...");
    }
}
