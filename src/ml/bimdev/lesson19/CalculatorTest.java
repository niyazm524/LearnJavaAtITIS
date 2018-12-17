package ml.bimdev.lesson19;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class CalculatorTest {

    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testFactOn7() {
        Calculator calc = new Calculator();
        assertEquals(5040, calc.fact(7));
    }

    @Test
    public void testFactOn1() {
        assertEquals(1, calc.fact(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOnNegative() {
        calc.fact(-2);
    }

    @Test
    public void testIsSquareOn4() {
        assertTrue(calc.isSquare(4));
    }

    @Test
    public void testOnSquare42() {
        assertFalse(calc.isSquare(42));
    }
}
