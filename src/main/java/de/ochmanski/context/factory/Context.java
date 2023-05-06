package de.ochmanski.context.factory;

import de.ochmanski.context.factory.service.AnotherService;
import de.ochmanski.context.factory.service.SomeService;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.inject.Singleton;

@Getter
@Singleton
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor //czy można użyć public constructor of enum?
public enum Context {

    INSTANCE;

    SomeService someService = new SomeService();
    AnotherService anotherService = new AnotherService();
    LoginService loginService = new LoginService(someService, anotherService);

    public static SomeService getSomeServiceInstance() {
        return INSTANCE.getSomeService();
    }

    public static AnotherService getAnotherServiceInstance() {
        return INSTANCE.getAnotherService();
    }

    public static LoginService getLoginServiceInstance() {
        return INSTANCE.getLoginService();
    }
}
