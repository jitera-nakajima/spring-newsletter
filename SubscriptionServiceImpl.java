package com.farukgenc.boilerplate.springboot.service;

import com.farukgenc.boilerplate.springboot.model.Subscription;
import com.farukgenc.boilerplate.springboot.repository.SubscriptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubscriptionServiceImpl implements SubscriptionService {

    private final SubscriptionRepository subscriptionRepository;

    @Override
    public void subscribe(Subscription subscription) {
        // Add validation logic here
        subscriptionRepository.save(subscription);
    }
}
