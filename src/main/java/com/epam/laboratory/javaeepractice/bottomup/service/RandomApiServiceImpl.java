//package com.epam.laboratory.javaeepractice.bottomup.service;
//
//import com.epam.laboratory.javaeepractice.bottomup.model.RandomApiModel;
//import com.epam.laboratory.javaeepractice.bottomup.repository.RandomApiRepository;
//
//import javax.inject.Inject;
//import javax.jws.WebMethod;
//import javax.jws.WebService;
//
//@WebService(serviceName = "RandomApiService", endpointInterface = "com.epam.laboratory.javaeepractice.bottomup.service.RandomApiService")
//public class RandomApiServiceImpl implements RandomApiService {
//    @Inject
//    private RandomApiRepository RandomApiRepositoryImpl;
//
//    @WebMethod
//    public RandomApiModel getRandomApiModel(String service) {
//        return RandomApiRepositoryImpl.getRandomApiModel(service);
//    }
//}
