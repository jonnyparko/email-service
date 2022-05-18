package com.maritz.email;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailService {
    @GetMapping("/")
    public String index() {
        return "I am an email service, use me to send emails!";
    }
}
