package dev.project;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ThingTest {

    @Test
    public void shouldReturnStuff() {
        Thing thing = new Thing();
        String result = thing.getResult();
        assertThat(result).isEqualTo("[a, b, c]");
    }
}
