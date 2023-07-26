package com.corsojava.hello;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    @Test
    void testMain() {
        assertEquals("Hello, World!", HelloWorld.hello());
    }
}
