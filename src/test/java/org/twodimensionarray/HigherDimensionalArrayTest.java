package org.twodimensionarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HigherDimensionalArrayTest {

    @Test
    public void testHigherDimensionalArray() {
        HigherDimensionalArray higherDimensionalArray = new HigherDimensionalArray();
        int[][][] arr = {{{1,3,5},{3,4,6}},{{2,5,6},{5,3,1}}};
        int result = higherDimensionalArray.solution(arr,1,1);
        assertEquals(9, result, "Higher Dimensional Array Tests Failed");
    }
}
