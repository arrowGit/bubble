package inc.arrow.appOne;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * Created by @author Oleh Strilets on 19.02.2017.
 */
public class CalculatorTest {
    @Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(4,2,1);
        assertEquals(7,calculator.getResult());
    }

    @Test
    public void substract() throws Exception {
        Calculator calculator = new Calculator();
        calculator.substract(4,2,1);
        assertEquals(-7,calculator.getResult());
    }

}