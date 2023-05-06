package de.ochmanski.context.factory.service;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.java.Log;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor(access = AccessLevel.PRIVATE, 
        onConstructor_= {@NotNull, @Contract(value = "-> new", pure = true)})
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class LoginService {

    @Inject
    SomeService someService;

    @Inject
    AnotherService anotherService;

    @Getter(value = AccessLevel.PRIVATE)
    @RequiredArgsConstructor(access = AccessLevel.PRIVATE, 
        onConstructor_= {@NotNull, @Contract(value = "-> new", pure = true)})
    @FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
    private enum Context { 
        INSTANCE;

        @NonNull
        @NotNull
        AnotherService anotherService = AnotherService.getInstance();

        @NonNull
        @NotNull
        SomeService someService = SomeService.getInstance();

        @NonNull
        @NotNull
        LoginService loginService = new LoginService(someService, anotherService);
    }

    @NotNull
    @Contract(value = "-> !null", pure = true)
    public static LoginService getInstance() {
        return Context.INSTANCE.getLoginService();
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
