package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int bot = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int flag = 0;
        while(result.size() != matrix.length * matrix[0].length) {
            if (flag == 0) {
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                flag++;
                top++;
            } else if (flag == 1) {
                for (int i = top; i <= bot; i++) {
                    result.add(matrix[i][right]);
                }
                flag++;
                right--;
            } else if (flag == 2) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bot][i]);
                }
                flag++;
                bot--;
            } else {
                for (int i = bot; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                flag = 0;
                left++;
            }
        }
        return result;
    }
}
