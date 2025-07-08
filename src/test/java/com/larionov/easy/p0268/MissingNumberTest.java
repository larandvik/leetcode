package com.larionov.easy.p0268;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingNumberTest {

    private final MissingNumber checker = new MissingNumber();

    @ParameterizedTest
    @MethodSource(value = "testCases0268")
    void missingNumber(TestCase testCase) {
        assertEquals(testCase.expected(), checker.missingNumber(testCase.input()));
    }

    private static Stream<TestCase> testCases0268() {
        return Stream.of(
                new TestCase(new int[]{3, 0, 1}, 2),
                new TestCase(new int[]{0, 1}, 2),
                new TestCase(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}, 8)
        );
    }

    private record TestCase(int[] input, int expected) {
    }

}