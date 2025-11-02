package br.com.code.narf.automated_test_with_java_code_narf;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysCompareTest {
    @Test
    void test(){
        int[] numbers = {25,8,21,32, 3};
        int[] expectedNumbers = {3,8,21,25,32};

        Arrays.sort(numbers);

        assertArrayEquals(numbers, expectedNumbers);
    }

    @Test
    @Timeout(value = 15, unit = TimeUnit.MILLISECONDS) //1 second
    void testSortPerformance(){
        int[] numbers = {25,8,21,32, 3};
        for (int i = 0; i < 100000; i++) {
           numbers[0] = i;
           Arrays.sort(numbers);
        }

    }

}
