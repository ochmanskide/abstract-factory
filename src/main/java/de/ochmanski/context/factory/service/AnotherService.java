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
        onConstructor_ = {@NotNull, @Contract(value = "-> new", pure = true)})
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AnotherService {

    @NotNull
    @Contract(value = "-> !null", pure = true)
    public static AnotherService inject() {
        return AnotherService.Context.INSTANCE.getAnotherService();
    }

    //<editor-fold defaultstate="collapsed" desc="Dependency Injection">
    @Getter(value = AccessLevel.PRIVATE)
    @RequiredArgsConstructor(access = AccessLevel.PRIVATE,
            onConstructor_ = {@NotNull, @Contract(value = "-> new", pure = true)})
    @FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
    private enum Context {
        INSTANCE;

        @NonNull
        @NotNull
        AnotherService anotherService = new AnotherService();
    }
    //</editor-fold>

    public String echo() {
        return "I am another service.";
    }
}
