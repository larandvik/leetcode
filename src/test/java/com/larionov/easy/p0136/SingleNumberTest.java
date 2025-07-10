package com.larionov.easy.p0136;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {

    @ParameterizedTest
    @MethodSource(value = "testCases0136")
    void singleNumber(TestCase testCase) {
        assertEquals(testCase.expected(), SingleNumber.singleNumber(testCase.input()));
    }

    private static Stream<TestCase> testCases0136() {
        return Stream.of(
                new TestCase(new int[]{2, 2, 1}, 1),
                new TestCase(new int[]{4, 1, 2, 1, 2}, 4),
                new TestCase(new int[]{1}, 1),
                new TestCase(new int[]{20,4,1,4,20},1)
        );
    }

    private record TestCase(int[] input, int expected) {
    }

}