package com.epam.laboratory.javaeepractice.bottomup.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RandomApiModel {
    private String service;
    private String randomFact;

    public RandomApiModel(String service, String randomFact) {
        this.service = service;
        this.randomFact = randomFact;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getRandomFact() {
        return randomFact;
    }

    public void setRandomFact(String randomFact) {
        this.randomFact = randomFact;
    }
}
