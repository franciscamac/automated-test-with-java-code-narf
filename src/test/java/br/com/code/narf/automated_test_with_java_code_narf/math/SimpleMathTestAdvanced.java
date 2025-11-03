package br.com.code.narf.automated_test_with_java_code_narf.math;

import br.com.code.narf.automated_test_with_java_code_narf.SimpleMath;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleMathTestAdvanced {

    SimpleMath simpleMath ;

    @BeforeEach
    void beforeEach(){
        simpleMath = new SimpleMath();
        System.out.println("Running @BeforeEach method!");
    }
    @AfterEach
    void afterEach(){
        System.out.println("Running @AfterEach method!");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Narf", "John", "Jane", "Doe"})
    void testValueSource(String firstName){
        System.out.println(firstName);
        assertNotNull(firstName);

    }

    @DisplayName("Teste double subtraction [firstNumber, secondNumber, expected]")
    @ParameterizedTest
    //@MethodSource("testDivisionInputParameters")
    //@MethodSource()
//    @CsvSource({
//            "6.2, 2, 3.1",
//            "71, 14, 5.07",
//            "18.3, 3.1, 5.9"
//    })
    @CsvFileSource(resources = "/testeDivision.csv", numLinesToSkip = 1)
    void testDivision(double fistNumber, double secondNumber, double expected){
        System.out.println("Test " + fistNumber + " / " + secondNumber + " = " + expected);
        Double actual = simpleMath.division(fistNumber, secondNumber);
        assertEquals(expected, actual,2D, () -> fistNumber + " / " +secondNumber + " did not produce " + expected);
    }
//    public static Stream<Arguments> testDivision() {
//        return Stream.of(
//                Arguments.of(6.2D, 2D, 3.1D),
//                Arguments.of(71.D, 14D, 5.07D),
//                Arguments.of(18.3D, 3.1D, 5.9D)
//        );
//    }
}
