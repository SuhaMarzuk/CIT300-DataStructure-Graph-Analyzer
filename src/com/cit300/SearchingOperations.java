package com.cit300;

import java.util.Arrays;

public class SearchingOperations {

    public static int linearSearch(int[] arr, int size, int target) {
        int steps = 0;
        for (int i = 0; i < size; i++) {
            steps++;
            if (arr[i] == target) {
                System.out.println("Linear Search: Found at index " + i + " | Steps: " + steps);
                return i;
            }
        }
        System.out.println("Linear Search: Not found | Steps: " + steps);
        return -1;
    }

    public static int binarySearch(int[] arr, int size, int target) {
        int[] sorted = Arrays.copyOf(arr, size);
        Arrays.sort(sorted);
        int low = 0, high = size - 1, steps = 0;

        while (low <= high) {
            steps++;
            int mid = (low + high) / 2;
            if (sorted[mid] == target) {
                System.out.println("Binary Search: Found at sorted index " + mid + " | Steps: " + steps);
                return mid;
            } else if (sorted[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Binary Search: Not found | Steps: " + steps);
        return -1;
    }

    public static void compare(int[] arr, int size, int target) {
        System.out.println("\n--- Searching Comparison ---");
        long start = System.nanoTime();
        linearSearch(arr, size, target);
        long linearTime = System.nanoTime() - start;

        start = System.nanoTime();
        binarySearch(arr, size, target);
        long binaryTime = System.nanoTime() - start;

        System.out.println("Linear Search Time: " + linearTime + " ns");
        System.out.println("Binary Search Time: " + binaryTime + " ns");
        System.out.println("Note: Binary Search requires sorted data but is faster for large datasets.");
    }
}