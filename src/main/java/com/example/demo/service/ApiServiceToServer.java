package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class ApiServiceToServer {
    
    private final ApiService apiService;

    public ApiServiceToServer(ApiService apiService) { 
        this.apiService = apiService;
    }

    public Long getData(String param) {
        try {
            if (!isAlphanumeric(param)) throw new Exception("not Valid");
            Long data1 = apiService.getDataByParam(param);
            System.out.println("Resp 1: " + data1);
            return data1;
        } catch (Exception e) {
            System.err.println("Error resp 1 " + e.getMessage());
        }
        return -1L;
    }

    public List<String> getStrings(String header) {
        try {
            if (!isAlphanumeric(header)) throw new Exception("not Valid");
            List<String> data2 = apiService.getStrings(header);
            System.out.println("Resp 2: " + data2);
            return data2;
        } catch (Exception e) {
            System.err.println("Error resp 2 " + e.getMessage());
        }
        return new ArrayList<String>();
    }

    private boolean isAlphanumeric(String value) {
        return value != null && value.matches("^[a-zA-Z0-9]+$");
    }
}
