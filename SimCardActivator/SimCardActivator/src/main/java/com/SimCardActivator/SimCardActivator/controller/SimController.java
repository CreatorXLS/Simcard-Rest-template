package com.SimCardActivator.SimCardActivator.controller;

import com.SimCardActivator.SimCardActivator.model.SimCard;
import com.SimCardActivator.SimCardActivator.service.SimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SimController {

    @Autowired
    private SimService simService;

    @PostMapping("/rica")
    public ResponseEntity<SimCard> registerSim(@RequestBody SimCard simCard) {
        return new ResponseEntity<SimCard>(simService.register(simCard), HttpStatus.CREATED);

    }
}
