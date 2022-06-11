package example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class AddTest {
    @Test
    public void calc() {
        assertThat(new BitwiseOr().calc(250,100), is(254));
    }
}
