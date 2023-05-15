package com.SimCardActivator.SimCardActivator.service;

import com.SimCardActivator.SimCardActivator.model.SimCard;
import com.SimCardActivator.SimCardActivator.repository.SimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimService {

    @Autowired
    private SimRepository simRepository;



    public SimCard register(SimCard simCard){
        return simRepository.save(simCard);
    }
}
