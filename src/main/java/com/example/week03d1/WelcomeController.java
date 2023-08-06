package com.example.week03d1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

// this is a message and have been committed by intellij

@RestController
public class WelcomeController {

    @GetMapping("/name")
    public String name() {
        return "My Name is Abdullah.";
    }


    @GetMapping("/age")
    public String age() {
        return "My Age is 25.";
    }

    @GetMapping("/check/status")
    public String checkStatus() {
        return "Everything OK";
    }

    @GetMapping("/health")
    public String health() {
        return "Server health is up and running";
    }


    @GetMapping("/names")
    public ArrayList<String> names() {
        ArrayList<String> n = new ArrayList<>();

        n.add("Abdullah");
        n.add("Ahmed");
        n.add("Saleh");

        return n;
    }
}
