package br.com.code.narf.automated_test_with_java_code_narf.math;

import br.com.code.narf.automated_test_with_java_code_narf.SimpleMath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleMathTest {
    @Test
    void testSum(){
        SimpleMath simpleMath = new SimpleMath();
        double fistNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = simpleMath.sum(fistNumber, secondNumber);
        Double expected = 8.2D;
        assertEquals(expected, actual, () -> fistNumber + " + " +secondNumber + " did not produce " + expected);

//        assertNotEquals(9.2, actual);
//        assertNotNull(actual);
    }

    @Test
    void testSubtraction(){
        SimpleMath simpleMath = new SimpleMath();
        double fistNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = simpleMath.subtraction(fistNumber, secondNumber);
        Double expected = 4.2D;
        assertEquals(expected, actual, () -> fistNumber + " - " +secondNumber + " did not produce " + expected);
    }

    @Test
    void testMultiplication(){
        SimpleMath simpleMath = new SimpleMath();
        double fistNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = simpleMath.multiplication(fistNumber, secondNumber);
        Double expected = 12.4D;
        assertEquals(expected, actual, () -> fistNumber + " * " +secondNumber + " did not produce " + expected);
    }
    @Test
    void testDivision(){
        SimpleMath simpleMath = new SimpleMath();
        double fistNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = simpleMath.division(fistNumber, secondNumber);
        Double expected = 3.1D;
        assertEquals(expected, actual, () -> fistNumber + " / " +secondNumber + " did not produce " + expected);
    }
    @Test
    void testMedian(){
        SimpleMath simpleMath = new SimpleMath();
        Double[] numbers = {1D, 3D, 2D, 5D, 4D};
        Double actual = simpleMath.median(numbers);
        Double expected = 3D;
        assertEquals(expected, actual, () -> "The median of " + java.util.Arrays.toString(numbers) + " did not produce " + expected);
    }
}
