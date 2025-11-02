package br.com.code.narf.automated_test_with_java_code_narf;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysCompareTest {
    @Test
    void test(){
        int[] numbers = {25,8,21,32, 3};
        int[] expectedNumbers = {3,8,21,25,32};

        Arrays.sort(numbers);

        assertArrayEquals(numbers, expectedNumbers);
    }
}
