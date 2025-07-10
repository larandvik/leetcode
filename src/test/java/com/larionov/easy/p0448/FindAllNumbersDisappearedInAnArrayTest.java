package com.larionov.easy.p0448;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FindAllNumbersDisappearedInAnArrayTest {

    private final FindAllNumbersDisappearedInAnArray checker = new FindAllNumbersDisappearedInAnArray();

    @ParameterizedTest
    @MethodSource(value = "testCase0448")
    void findDisappearedNumbers(TestCase testCase) {
        assertEquals(testCase.expected(), checker.findDisappearedNumbers(testCase.arr()));
    }

    private static Stream<TestCase> testCase0448() {
        return Stream.of(
                new TestCase(new int[]{4, 3, 2, 7, 8, 2, 3, 1}, List.of(5, 6)),
                new TestCase(new int[]{1, 1}, List.of(2))
        );
    }

    private record TestCase(int[] arr, List<Integer> expected) {
    }

}