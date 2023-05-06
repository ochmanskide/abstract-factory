package de.ochmanski.context.factory;

import de.ochmanski.context.factory.service.AnotherService;
import de.ochmanski.context.factory.service.SomeService;
import lombok.RequiredArgsConstructor;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class LoginService {

    @Inject
    SomeService someService;

    @Inject
    AnotherService anotherService;

    public String echo() {
        return "I am some service";
    }

    public String echoSomeService() {
        return someService.echo();
    }

    public String echoAnotherService() {
        return anotherService.echo();
    }
}
