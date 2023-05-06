package de.ochmanski.context.factory.service;

import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class AnotherService {


    public String echo() {
        return "I am another service";
    }
}
