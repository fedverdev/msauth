package io.github.fedverdev.msauth.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController("api/v1")
public class AuthController {

    @Operation()
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
