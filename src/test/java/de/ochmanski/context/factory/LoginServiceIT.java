package de.ochmanski.context.factory;

import de.ochmanski.context.factory.service.LoginService;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;

class LoginServiceIT {

    @Inject
    LoginService unitUnderTest = LoginService.getInstance();

    @Test
    void echo() {
        String actual = unitUnderTest.echo();
        assertThat(actual).isEqualTo("I am a login service.");
    }

    @Test
    void echoSomeService() {
        String actual = unitUnderTest.echoSomeService();
        assertThat(actual).isEqualTo("I am some service.");
    }

    @Test
    void echoAnotherService() {
        String actual = unitUnderTest.echoAnotherService();
        assertThat(actual).isEqualTo("I am another service.");
    }
}
