package de.ochmanski.context.factory;

import de.ochmanski.context.factory.service.AnotherService;
import de.ochmanski.context.factory.service.SomeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LoginServiceTest {

    @Mock
    SomeService someService;

    @Mock
    AnotherService anotherService;

    @InjectMocks
    LoginService unitUnderTest;

    @Test
    void echo() {
        String actual = unitUnderTest.echo();
        assertThat(actual).isEqualTo("I am a login service");
    }

    @Test
    void echoSomeService() {
        when(someService.echo()).thenReturn("message from some mock");
        String actual = unitUnderTest.echoSomeService();
        assertThat(actual).isEqualTo("message from some mock");
    }

    @Test
    void echoAnotherService() {
        when(anotherService.echo()).thenReturn("message from another mock");
        String actual = unitUnderTest.echoAnotherService();
        assertThat(actual).isEqualTo("message from another mock");
    }
}
