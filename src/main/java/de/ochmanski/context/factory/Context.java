package de.ochmanski.context.factory;

import de.ochmanski.context.factory.service.AnotherService;
import de.ochmanski.context.factory.service.LoginService;
import de.ochmanski.context.factory.service.SomeService;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import javax.inject.Singleton;

@Getter
@Singleton
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum Context {

    INSTANCE;

    @NonNull
    @NotNull
    SomeService someService = createSomeService();

    @NonNull
    @NotNull
    AnotherService anotherService = createAnotherService();

    @NonNull
    @NotNull
    LoginService loginService = createLoginService();

    @NotNull
    @Contract(value = "-> new", pure = true)
    private static SomeService createSomeService() {
        return new SomeService();
    }

    @NotNull
    @Contract(value = "-> new", pure = true)
    private static AnotherService createAnotherService() {
        return new AnotherService();
    }

    @NotNull
    @Contract(value = "-> !null", pure = true)
    public static SomeService getSomeServiceInstance() {
        return INSTANCE.getSomeService();
    }

    @NotNull
    @Contract(value = "-> !null", pure = true)
    public static AnotherService getAnotherServiceInstance() {
        return INSTANCE.getAnotherService();
    }

    @NotNull
    @Contract(value = "-> !null", pure = true)
    public static LoginService getLoginServiceInstance() {
        return INSTANCE.getLoginService();
    }

    @NotNull
    @Contract(value = "-> new", pure = true)
    private LoginService createLoginService() {
        return new LoginService(someService, anotherService);
    }
}
