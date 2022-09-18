package com.epam.laboratory.javaeepractice.bottomup;

import com.epam.laboratory.javaeepractice.bottomup.service.RandomApiServiceImpl;

import javax.xml.ws.Endpoint;

public class RandomApiServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/random", new RandomApiServiceImpl());
    }
}
