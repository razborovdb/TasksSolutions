package org.twodimensionarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TwoDimensionalArrayTest {

    @Test
    public void testIdentityMatrix() {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        /** size 5 **/
        int[][] result = twoDimensionalArray.solution(5);
        assertNotNull(result, "Two Dimensional Array Tests Failed");
        assertEquals(5, result.length, "Two Dimensional Array Tests Failed");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (i == j) {
                    assertEquals(1, result[i][j], "Two Dimensional Array Tests Failed");
                } else {
                    assertEquals(0, result[i][j], "Two Dimensional Array Tests Failed");
                }
            }
        }
    }
}
