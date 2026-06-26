package io.github.fedverdev.msauth.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AuthController {

    @PostMapping("/register")
    public String register(@RequestBody String entity) {
        //TODO: process POST request
        
        throw new UnsupportedOperationException();
    }

    @PostMapping("/login")
    public String login(@RequestBody String entity) {
        //TODO: process POST request

        throw new UnsupportedOperationException();
    }

    @PostMapping("/refresh")
    public String refresh(@RequestBody String entity) {
        //TODO: process POST request
        
        throw new UnsupportedOperationException();
    }

    @PostMapping("logout")
    public String logout(@RequestBody String entity) {
        //TODO: process POST request
        
        throw new UnsupportedOperationException();
    }
    
    
    
}
