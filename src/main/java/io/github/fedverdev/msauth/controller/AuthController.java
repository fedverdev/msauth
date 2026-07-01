package io.github.fedverdev.msauth.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController("api/v1")
public class AuthController {

    @Operation(summary = "Регистрация пользователя", description = "Регистрирует пользователя в системе.")
    @PostMapping("/register")
    public String register(@RequestBody String entity) {
        //TODO: process POST request
        
        throw new UnsupportedOperationException();
    }

    @Operation(summary = "Вход в систему", description = "Возрващает refresh token и access token.")
    @PostMapping("/login")
    public String login(@RequestBody String entity) {
        //TODO: process POST request

        throw new UnsupportedOperationException();
    }

    @Operation(summary = "Обновление токена", description = "Возвращает новый access token.")
    @PostMapping("/refresh")
    public String refresh(@RequestBody String entity) {
        //TODO: process POST request
        
        throw new UnsupportedOperationException();
    }

    @Operation(summary = "Выход из системы", description = "Инвалидирует access token и refresh token")
    @PostMapping("logout")
    public String logout(@RequestBody String entity) {
        //TODO: process POST request
        
        throw new UnsupportedOperationException();
    }
    
}
