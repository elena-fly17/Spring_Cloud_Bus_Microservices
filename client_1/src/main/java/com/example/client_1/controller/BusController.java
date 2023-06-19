package com.example.client_1.controller;

import com.example.client_1.model.InfoModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusController {

    private InfoModel infoModel;

    public BusController(InfoModel infoModel) {
        this.infoModel = infoModel;
    }

    @GetMapping("/getInfo")
    public String getInfoFromServer() {
        return infoModel.getDataField();
    }
}
