package com.larionov.easy.p0070;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsTest {

    @ParameterizedTest
    @MethodSource(value = "testCases0070")
    void climbStairs(TestCase testCase) {
        assertEquals(testCase.expected(), ClimbingStairs.climbStairs(testCase.input()));
    }

    private static Stream<TestCase> testCases0070() {
        return Stream.of(
                new TestCase(2, 2),
                new TestCase(3, 3)
        );
    }

    private record TestCase(int input, int expected) {
    }
}