package au.com.telstra.simcardactivator.service;

import au.com.telstra.simcardactivator.model.SimCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SimService {

    private RestTemplate restTemplate;

    @Autowired
    public SimService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String registerSim(SimCard simCard){

        HttpEntity<SimCard> entity = new HttpEntity<>(simCard);
        return restTemplate.exchange("http://localhost:8081/api/v1/rica", HttpMethod.POST, entity, String.class).getBody() ;
    }
}
