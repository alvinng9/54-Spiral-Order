package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void spiralOrderTest() {
        Solution solution = new Solution();
        int[][] inputOne = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        assertEquals(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5), solution.spiralOrder(inputOne));
        int[][] inputTwo = new int[][] {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        assertEquals(Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7), solution.spiralOrder(inputTwo));
    }
}