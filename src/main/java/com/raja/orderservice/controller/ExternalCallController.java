package com.raja.orderservice.controller;

import com.raja.orderservice.client.MockApiClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Exposes an endpoint to trigger MockApiClient's call to the mock external
 * API, so the Vault-sourced API key path can be exercised and verified
 * end-to-end (see README - "Verify it all works").
 */
@RestController
@RequestMapping("/external")
public class ExternalCallController {

    private final MockApiClient mockApiClient;

    public ExternalCallController(MockApiClient mockApiClient) {
        this.mockApiClient = mockApiClient;
    }

    @GetMapping("/call")
    public String call() {
        return mockApiClient.ping();
    }
}
