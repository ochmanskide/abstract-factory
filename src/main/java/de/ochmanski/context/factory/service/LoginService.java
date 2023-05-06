package de.ochmanski.context.factory.service;

import de.ochmanski.context.factory.Context;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class LoginService {

    @Inject
    SomeService someService;

    @Inject
    AnotherService anotherService;

    public static LoginService getInstance() {
        return Context.getLoginServiceInstance();
    }

    public String echo() {
        return "I am a login service.";
    }

    public String echoSomeService() {
        return someService.echo();
    }

    public String echoAnotherService() {
        return anotherService.echo();
    }
}
