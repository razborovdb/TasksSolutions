package org.twodimensionarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovingWindowsTest {

    @Test
    public void testMovingWindowsAverage() {
        MovingWindows movingWindows = new MovingWindows();
        int[] arr = {1, 4, -5, 6, -3};
        double[] expected = {0, 1.6666666666666667, -0.6666666666666666};
        double[] result = movingWindows.solution(arr, 3);
        assertEquals(3, result.length, "Moving Window Average Tests Failed");
        for (int i = 0; i < result.length; i++) {
            assertEquals(expected[i], result[i], "Moving Window Average Tests Failed");
        }
    }
}