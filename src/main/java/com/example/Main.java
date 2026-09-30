package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "<html>" +
               "<head>" +
               "<title>DevOps Lab</title>" +
               "</head>" +
               "<body style='margin:0; background:#0d1117; color:#e6edf3; " +
               "font-family:Arial; text-align:center; padding-top:18vh;'>" +
		"<h1>Hello, DevOps World! 👋</h1>" +

               "<p style='color:#3fb950;'>● SYSTEM ONLINE</p>" +

               "<h2>Build. Deploy. Repeat.</h2>" +

               "<p style='color:#8b949e;'>" +
               "A small Java application running in the DevOps world." +
               "</p>" +

               "<p style='color:#58a6ff;'>" +
               "Linux · Java · Cloud · CI/CD · Automation" +
               "</p>" +

               "<p style='color:#8b949e;'>" +
               "Build → Test → Deploy → Monitor" +
               "</p>" +

               "</body>" +
               "</html>";
    }
}

