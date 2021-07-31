import org.junit.Before;
import org.junit.Rule;
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
        Calculator calculator=new Calculator();

        String input= "add 1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        //assertEquals("add 1", calculator.computation("1"));
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

    }
}