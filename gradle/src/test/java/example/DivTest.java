package example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class DivTest {
    @Test
    public void calc() {
        assertThat(new Div().calc(8,2), is(4));
        assertThat(new Div().calc(8,1), is(8));
    }
}
