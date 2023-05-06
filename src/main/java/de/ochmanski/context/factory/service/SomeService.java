package de.ochmanski.context.factory.service;

import de.ochmanski.context.factory.Context;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class SomeService {

    public static SomeService getInstance() {
        return Context.getSomeServiceInstance();
    }

    public String echo() {
        return "I am some service.";
    }
}
