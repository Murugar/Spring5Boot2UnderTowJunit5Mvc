package com.iqmsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootMvcJunit5Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMvcJunit5Application.class, args);
    }
}

@RestController
class WelcomeController {
    @GetMapping("/test")
    public String getValue() {
        return "test";
    }
    @GetMapping("/welcome")
    public String getWelcome() {
        return "Greetings User";
    }
}

@RestController
class HelloController {
    @GetMapping("/hello")
    public String getValue() {
        return "hello";
    }
   
}
