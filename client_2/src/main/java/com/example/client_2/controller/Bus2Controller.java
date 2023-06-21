package com.example.client_2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Bus2Controller {

    @Value("${bus.dataField}")
    private String dataField2;

    @GetMapping("/getInfo2")
    public String getInfoFromServer() {
        return dataField2;
    }
}
