package de.ochmanski.context.factory.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AnotherService {

    public String echo() {
        return "I am another service";
    }
}
