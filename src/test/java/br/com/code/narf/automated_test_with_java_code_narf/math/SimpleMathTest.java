package br.com.code.narf.automated_test_with_java_code_narf.math;

import br.com.code.narf.automated_test_with_java_code_narf.SimpleMath;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Test Math Operations in SimpleMath Class")
public class SimpleMathTest {
    //test[System Under Test]_[Condition]_[Expected Result]
    @Test
    @DisplayName("Sum of 6.2 and 2 should be 8.2")
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo(){
        // AAA
        // Arrange, Act, Assert
        //Given / Arrange
        SimpleMath simpleMath = new SimpleMath();

        double fistNumber = 6.2D;
        double secondNumber = 2D;
        double expected = 8.2D;

        //When / Act
        Double actual = simpleMath.sum(fistNumber, secondNumber);


        //Then  // Assert
        assertEquals(expected, actual, () -> fistNumber + " + " +secondNumber + " did not produce " + expected);

//        assertNotEquals(9.2, actual);
//        assertNotNull(actual);
    }

    @Test
    @DisplayName("Subtraction of 2 from 6.2 should be 4.2")
    void testSubtraction(){
        SimpleMath simpleMath = new SimpleMath();
        double fistNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = simpleMath.subtraction(fistNumber, secondNumber);
        Double expected = 4.2D;
        assertEquals(expected, actual, () -> fistNumber + " - " +secondNumber + " did not produce " + expected);
    }

    @Test
    @DisplayName("Multiplication of 6.2 by 2 should be 12.4")
    void testMultiplication(){
        SimpleMath simpleMath = new SimpleMath();
        double fistNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = simpleMath.multiplication(fistNumber, secondNumber);
        Double expected = 12.4D;
        assertEquals(expected, actual, () -> fistNumber + " * " +secondNumber + " did not produce " + expected);
    }
    @Test
    @DisplayName("Division of 6.2 by 2 should be 3.1")
    void testDivision(){
        SimpleMath simpleMath = new SimpleMath();
        double fistNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = simpleMath.division(fistNumber, secondNumber);
        Double expected = 3.1D;
        assertEquals(expected, actual, () -> fistNumber + " / " +secondNumber + " did not produce " + expected);
    }
    @Disabled("Todo: We need stoll work on it")
    @Test
    @DisplayName("Division of a number by zero should throw Ar6ithmeticException")
    void testDivision_When_firstNunberIsDividedByZero_ShouldThrowArithmeticException() {
        SimpleMath simpleMath = new SimpleMath();
        double fistNumber = 6.2D;
        double secondNumber = 0D;
    }


    @Test
    @DisplayName("Median of an array of numbers should return the correct median value")
    void testMedian(){
        SimpleMath simpleMath = new SimpleMath();
        Double[] numbers = {1D, 3D, 2D, 5D, 4D};
        Double actual = simpleMath.median(numbers);
        Double expected = 3D;
        assertEquals(expected, actual, () -> "The median of " + java.util.Arrays.toString(numbers) + " did not produce " + expected);
    }

}
