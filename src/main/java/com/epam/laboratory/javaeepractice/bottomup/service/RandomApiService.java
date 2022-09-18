package com.epam.laboratory.javaeepractice.bottomup.service;

import com.epam.laboratory.javaeepractice.bottomup.model.RandomApiModel;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "RandomApiService")
public interface RandomApiService {
    @WebMethod
    RandomApiModel getRandomApiResponse();
}
