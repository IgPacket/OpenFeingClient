package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ApiServiceToServer;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ApiController {
    
    private ApiServiceToServer apiServiceToServer;

    @GetMapping("/param")
    @ResponseBody
    public ResponseEntity<Long> getData() {
        return ResponseEntity.ok(apiServiceToServer.getData("paramma"));
    }

    @GetMapping("/strings")
    @ResponseBody
    public ResponseEntity<List<String>> getStrings() {
        return ResponseEntity.ok(apiServiceToServer.getStrings("head162"));
    }

}
