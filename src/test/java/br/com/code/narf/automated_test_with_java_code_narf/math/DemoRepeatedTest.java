package br.com.code.narf.automated_test_with_java_code_narf.math;

import br.com.code.narf.automated_test_with_java_code_narf.SimpleMath;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DemoRepeatedTest {
    SimpleMath simpleMath ;

    @BeforeEach
    void beforeEach(){
        simpleMath = new SimpleMath();
        System.out.println("Running @BeforeEach method!");
    }

    @RepeatedTest(value = 3, name = "{displayName}. Repetition " + "{currentRepetition} of {totalRepetitions}!")
    @DisplayName("Division of a number by zero should throw ArithmeticException")
    void testDivision_When_firstNunberIsDividedByZero_ShouldThrowArithmeticException(
            RepetitionInfo repetitionInfo,
            TestInfo testInfo
    ) {
        System.out.println("Repetition " + repetitionInfo.getCurrentRepetition() +
                " of " + repetitionInfo.getTotalRepetitions());
        System.out.println("Running "+ testInfo.getTestMethod().get().getName());

        //given
        double fistNumber = 6.2D;
        double secondNumber = 0D;

        var expectedMessage = "Division by zero is not allowed.";

        ArithmeticException actual  = assertThrows(ArithmeticException.class, () -> {
            //when and then
            simpleMath.division(fistNumber, secondNumber);
        }, () -> "Expected ArithmeticException was not thrown.");

        assertEquals(expectedMessage, actual.getMessage(), () -> "Exception message did not match expected message.");

    }

}
