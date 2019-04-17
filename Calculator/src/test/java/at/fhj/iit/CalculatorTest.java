package at.fhj.iit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calc;

    /**
     * inits Calculator with CalculatorImpl
     */
    @Before
    public void setup() {

        // SETUP PHASE
        calc = new CalculatorImpl();
    }

    @Test
    public void testAdd() {

        // EXERCISE PHASE
        double value = calc.add(5, 2);

        // VERIFY PHASE
        assertEquals(7, value, 0.001);
    }

    /**
     * tests calculator function add
     * use the function
     * use assertEquals to verify the result
     */
    @Test
    public void testAdd2() {

        assertEquals(-3, calc.add(-3,0), 0.001);
    }

    /**
     * tests calculator function minus
     * use the function
     * use assertEquals to verify the result
     */
    @Test
    public void testMinus() {

        assertEquals(0,calc.minus(3,3),0.001);
    }

    /**
     * tests calculator function multiply
     * use the function
     * use assertEquals to verify the result
     */
    @Test
    public void testMultiply() {

        assertEquals(-3,calc.multiply(3,-1),0.001);
    }

    /**
     * tests calculator function divide
     * use the function
     * use assertEquals to verify the result
     */
    @Test
    public void testDivide() {

        assertEquals(3,calc.divide(-9,-3),0.001);
    }


    // VERIFY
    @Test(expected = ArithmeticException.class)
    public void testDivideWithNull() {
        // EXERCISE
        calc.divide(5, 0);
    }
}
