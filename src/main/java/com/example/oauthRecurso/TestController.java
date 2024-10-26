package com.example.oauthRecurso;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test")
    public String test() {
        return "¡Recurso protegido accedido exitosamente!";
    }
}
