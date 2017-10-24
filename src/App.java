import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class App {
    @Test
    public void testAdd() {
        String str = "junit is working fine";
        System.out.println(str);
        assertEquals("junit is working fine", str);
    }
}

