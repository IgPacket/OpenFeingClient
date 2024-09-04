package com.example.demo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import feign.Headers;
import feign.Param;

@FeignClient(name = "localhost", url = "http://localhost:8081/")
public interface ApiService {

    @GetMapping("/param")
    Long getDataByParam(@RequestParam("param") String param);

    @GetMapping("/strings")
    List<String> getStrings(@RequestHeader("header") String headerValue);
    
}
