package de.ochmanski.context.factory;

import de.ochmanski.context.factory.service.AnotherService;
import de.ochmanski.context.factory.service.SomeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

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
        assertThat(actual).isEqualTo("lkj");
    }

    @Test
    void echoSomeService() {
        String actual = unitUnderTest.echoSomeService();
        assertThat(actual).isEqualTo("lkj");
    }

    @Test
    void echoAnotherService() {
        String actual = unitUnderTest.echoAnotherService();
        assertThat(actual).isEqualTo("lkj");
    }
}
