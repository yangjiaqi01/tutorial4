package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class Calc {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
}
public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }

    @Test
      void testSubtraction() {
        assertEquals(2, c.subtract(4, 2));
    }


}
