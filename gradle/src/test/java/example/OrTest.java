package example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class BitwiseOrTest {
    @Test
    public void calc() {
        assertThat(new BitwiseOr().calc(25,100), is(125));
    }
}
