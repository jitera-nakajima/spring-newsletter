package com.farukgenc.boilerplate.springboot.controller;

import com.farukgenc.boilerplate.springboot.model.Subscription;
import com.farukgenc.boilerplate.springboot.service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/subscribe")
public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    @PostMapping
    public ResponseEntity<String> subscribe(@RequestBody Subscription subscription) {
        subscriptionService.subscribe(subscription);
        return ResponseEntity.status(HttpStatus.CREATED).body("Subscription successful");
    }
}
