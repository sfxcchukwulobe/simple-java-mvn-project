package tool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTwoNumbers() {
        assertEquals(2, Calculator.addTwoNumbers(1, 1));
    }
}
