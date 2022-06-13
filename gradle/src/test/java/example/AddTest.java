package example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class AddTest {
    @Test
    public void calc() {
        assertThat(new Add().calc(3,4), is(7));
        assertThat(new Add().calc(4,4), is(8));
        assertThat(new Add().calc(6,4), is(10));
        assertThat(new Add().calc(3,22), is(25));
        assertThat(new Add().calc(3,-5), is(-2));
        assertThat(new Add().calc(3,-3), is(0));
    }
}
