package de.ochmanski.context.factory.service;

import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class SomeService {

    public String echo() {
        return "I am some service.";
    }
}
