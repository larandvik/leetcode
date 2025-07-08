package com.larionov.easy.p0217;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ContainsDuplicateTest {

    private final ContainsDuplicate checker = new ContainsDuplicate();

    @ParameterizedTest
    @MethodSource(value = "testCases0217")
    void containsDuplicate(TestCase testCase) {
        assertEquals(testCase.expected(), checker.containsDuplicate(testCase.input()));
    }

    private static Stream<TestCase> testCases0217() {
        return Stream.of(
                new TestCase(new int[]{1, 2, 3, 1}, true),
                new TestCase(new int[]{1, 2, 3, 4}, false),
                new TestCase(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true)
        );
    }

    private record TestCase(int[] input, Boolean expected) {
    }

}