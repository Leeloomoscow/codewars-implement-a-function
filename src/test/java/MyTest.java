import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void sampleTest() {
        assertEquals(4, K.multiply(2, 2));
        assertEquals(10, K.multiply(5, 2));
        assertEquals(100, K.multiply(100, 1));
        assertEquals(0, K.multiply(0, 1000));
    }

    private static class K {
        public static int multiply(int num1, int num2) {
            int sum = num1 * num2;
            return sum;
        }
    }
}
