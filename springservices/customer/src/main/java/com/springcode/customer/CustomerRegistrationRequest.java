package com.springcode.customer;

public record CustomerRegistrationRequest(String firstname,
                                          String lastName,
                                          String email) {

}
