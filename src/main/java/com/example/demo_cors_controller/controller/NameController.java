package com.example.demo_cors_controller.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
@CrossOrigin // Questo abilita CORS a livello di controller
public class NameController {

    @GetMapping
    public String getName(@RequestParam String name) {
        return name;
    }

    @PostMapping
    public String reverseName(@RequestBody String name) {
        return new StringBuilder(name).reverse().toString();
    }
}