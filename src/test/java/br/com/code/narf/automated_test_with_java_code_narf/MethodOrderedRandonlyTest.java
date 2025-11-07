package br.com.code.narf.automated_test_with_java_code_narf;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(1)
@TestMethodOrder(MethodOrderer.Random.class)
public class MethodOrderedRandonlyTest {
    @Test
    void test1(){
        System.out.println("Running test 1");
    }
    @Test
    void test2() {
        System.out.println("Running test 2");
    }
    @Test
    void test3() {
        System.out.println("Running test 3");
    }
    @Test
    void test4() {
        System.out.println("Running test 4");
    }
}
