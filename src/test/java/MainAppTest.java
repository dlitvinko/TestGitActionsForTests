import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainAppTest {

    @Test
    public void firstTest() {
        System.out.println("firstTest - test text");
        int result = 10;
        assertEquals(10, result);
    }

    @Test
    public void secondTest() {
        System.out.println("secondTest - test text");
        int result = 555;
        assertEquals(555, result);
    }
}
