package com.epam.laboratory.javaeepractice.bottomup.service;

import com.epam.laboratory.javaeepractice.bottomup.model.RandomApiModel;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

@WebService(serviceName = "RandomApiService",
        endpointInterface = "com.epam.laboratory.javaeepractice.bottomup.service.RandomApiService",
        portName="RandomApiServicePort")
public class RandomApiServiceImpl implements RandomApiService {
    private static final String REST_URI = "http://numbersapi.com/random/math";
    private Client client = ClientBuilder.newClient();

    @WebMethod
    public RandomApiModel getRandomApiResponse() {
        return client.target(REST_URI).request(MediaType.APPLICATION_XML).get(RandomApiModel.class);
    }
}
