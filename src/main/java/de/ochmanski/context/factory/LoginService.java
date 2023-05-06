package de.ochmanski.context.factory;

import de.ochmanski.context.factory.service.AnotherService;
import de.ochmanski.context.factory.service.SomeService;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Builder(toBuilder = true)
public class LoginService {

    @Inject
    SomeService someService;

    @Inject
    AnotherService anotherService;

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
