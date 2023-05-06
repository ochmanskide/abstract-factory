package de.ochmanski.context.factory.service;

import de.ochmanski.context.factory.Context;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AnotherService {

    public static AnotherService getInstance() {
        return Context.getAnotherServiceInstance();
    }

    public String echo() {
        return "I am another service.";
    }
}
