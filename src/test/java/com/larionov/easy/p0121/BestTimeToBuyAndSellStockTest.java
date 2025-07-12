package com.larionov.easy.p0121;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockTest {

    @ParameterizedTest
    @MethodSource(value = "testCases0121")
    void maxProfit(TestCase testCase) {
        assertEquals(testCase.expected(), BestTimeToBuyAndSellStock.maxProfit(testCase.input()));
    }

    private static Stream<TestCase> testCases0121() {
        return Stream.of(
                new TestCase(new int[]{7, 1, 5, 3, 6, 4}, 5),
                new TestCase(new int[]{7, 6, 4, 3, 1}, 0)
        );
    }

    private record TestCase(int[] input, int expected) {
    }
}