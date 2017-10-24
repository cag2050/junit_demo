import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageUtilTest {
    private String message = "hello junit";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
//        message = "hello jun";
        assertEquals(message, messageUtil.printMessage());
    }
}
