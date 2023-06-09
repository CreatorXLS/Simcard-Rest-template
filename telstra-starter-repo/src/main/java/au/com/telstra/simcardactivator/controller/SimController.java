package au.com.telstra.simcardactivator.controller;

import au.com.telstra.simcardactivator.model.SimCard;
import au.com.telstra.simcardactivator.service.SimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SimController {

    @Autowired
    private SimService service;

    @PostMapping("/register")
    public String registerSim(@RequestBody SimCard simCard){
        return service.registerSim(simCard);
    }
}
