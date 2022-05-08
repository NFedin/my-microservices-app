package com.nikf.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
