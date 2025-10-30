package br.com.code.narf.automated_test_with_java_code_narf.math;

import br.com.code.narf.automated_test_with_java_code_narf.SimpleMath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleMathTest {
    @Test
    void testSum(){
        SimpleMath simpleMath = new SimpleMath();
        Double result = simpleMath.sum(6.2D, 2D);
        Double expected = 8.2D;
        assertEquals(expected, result);
    }
}
