package de.ochmanski.context.factory;

import de.ochmanski.context.factory.service.AnotherService;
import de.ochmanski.context.factory.service.SomeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

class LoginServiceIT {

    @Inject
    LoginService unitUnderTest = Context.getLoginServiceInstance();

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
