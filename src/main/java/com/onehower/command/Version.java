package com.onehower.command;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Version implements CommandLineRunner {

    public void run(String ... args) {
        System.out.println("------------------------------------------");
        System.out.println("OneHower backend running - version: 1.0.0");
        System.out.println("------------------------------------------");
    }
}
