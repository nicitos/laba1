package demo.parallel;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexTest {
    @Test
    public void testPlus() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        Complex result = new Complex(a.getReal(), a.getImag()).plus(b);
        assertEquals(4.0, result.getReal(), 0.001);
        assertEquals(6.0, result.getImag(), 0.001);
    }

    @Test
    public void testTimes() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        Complex result = new Complex(a.getReal(), a.getImag()).times(b);
        assertEquals(-5.0, result.getReal(), 0.001);
        assertEquals(10.0, result.getImag(), 0.001);
    }

    @Test
    public void testCube() {
        Complex a = new Complex(2, 0);
        Complex result = new Complex(a.getReal(), a.getImag()).cube();
        assertEquals(8.0, result.getReal(), 0.001);
        assertEquals(0.0, result.getImag(), 0.001);
    }
}