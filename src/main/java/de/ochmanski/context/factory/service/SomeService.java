package de.ochmanski.context.factory.service;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor(access = AccessLevel.PRIVATE,
        onConstructor_= {@NotNull, @Contract(value = "-> new", pure = true)})
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class SomeService {

    @Getter(value = AccessLevel.PRIVATE)
    @RequiredArgsConstructor(access = AccessLevel.PRIVATE,
            onConstructor_= {@NotNull, @Contract(value = "-> new", pure = true)})
    @FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
    private enum Context {
        INSTANCE;

        @NonNull
        @NotNull
        SomeService someService = new SomeService();
    }

    @NotNull
    @Contract(value = "-> !null", pure = true)
    public static SomeService getInstance() {
        return SomeService.Context.INSTANCE.getSomeService();
    }

    public String echo() {
        return "I am some service.";
    }
}
