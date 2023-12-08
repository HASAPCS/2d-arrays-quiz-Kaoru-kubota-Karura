package com.example;

public class TwoDArrayOperations {

    // Exercise 1: Check for a Specific Value in a 2D Array
    public static boolean containsValue(int[][] array, int value) {
        // TODO: Implement the logic to check if the 2D array contains the specified value.
        for (int[] row : array) {
            for (int element : row) {
                if (element == value) {
                    return true;
                }
            }
        }
        return false;
        // Placeholder return value
    }

    // Exercise 2: Calculate the Average of All Elements in a 2D Array
    public static double calculateAverage(int[][] array) {
        // TODO: Implement the logic to calculate the average of all elements in the 2D array.
        int sum = 0;
        int count = 0;
        for (int[] row : array) {
            for (int value : row) {
                sum += value;
                count++;
            }
        }
        return (double) sum / count;
        // Placeholder return value
    }

    // Exercise 3: Find the Minimum Value in a 2D Array
    public static int findMinimumValue(int[][] array) {
        // TODO: Implement the logic to find the minimum value in the 2D array.
        int min = Integer.MAX_VALUE;
        for (int[] row : array) {
            for (int value : row) {
                min = Math.min(min, value);
            }
        }
        return min;
    }
}
