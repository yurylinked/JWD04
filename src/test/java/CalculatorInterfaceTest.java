import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class CalculatorInterfaceTest {
    Calculator calculator=new Calculator();
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void setNumbers() {
    }

    @Test
    public void computation() {
    }

    @Test
    public void menu() {
    }

    @Test
    public void hello() {
    }

    @Test
    public void addition() {
    }

    @Test
    public void substraction() {
    }

    @Test
    public void division() {
    }

    @Test
    public void multiplication() {
        double a = 2.2;
        double b = 2.2;
        double result = a * b;

        double input = 4.4;
      //  InputStream in = new ByteArrayInputStream(result);
       // System.setIn(in);

        assertEquals(result, calculator.multiplication());

    }
}