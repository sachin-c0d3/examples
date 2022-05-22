package example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class AddTest {
    @Test
    public void calc() {
        assertThat(new Add().calc(3,4), is(7));
    }
    @Test
    public void calc() {
        assertThat(new Add().calc(3,0), is(3));
    }
    @Test
    public void calc() {
        assertThat(new Add().calc(34,9), is(7));
    }
}
