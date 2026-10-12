package com.cit300;

import java.util.Arrays;

public class PerformanceComparison {

    public static void runAll() {
        System.out.println("\n===== PERFORMANCE COMPARISON =====");
        System.out.printf("%-20s %-20s %-15s%n", "Operation", "Algorithm", "Steps");
        System.out.println("---------------------------------------------------------");

        int[] data = {45, 12, 78, 34, 89, 23, 67, 90, 11, 56};
        int target = 67;

        int linearSteps = 0;
        for (int i = 0; i < data.length; i++) {
            linearSteps++;
            if (data[i] == target) break;
        }
        System.out.printf("%-20s %-20s %-15d%n", "Search", "Linear Search", linearSteps);

        int[] sorted = Arrays.copyOf(data, data.length);
        Arrays.sort(sorted);
        int low = 0, high = sorted.length - 1, binarySteps = 0;
        while (low <= high) {
            binarySteps++;
            int mid = (low + high) / 2;
            if (sorted[mid] == target) break;
            else if (sorted[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        System.out.printf("%-20s %-20s %-15d%n", "Search", "Binary Search", binarySteps);

        System.out.printf("%-20s %-20s %-15s%n", "Graph Traversal", "BFS", "O(V+E)");
        System.out.printf("%-20s %-20s %-15s%n", "Graph Traversal", "DFS", "O(V+E)");

        System.out.println("\n--- Complexity Explanation ---");
        System.out.println("Linear Search: O(n) - checks each element one by one.");
        System.out.println("Binary Search: O(log n) - divides search space in half each time.");
        System.out.println("BFS/DFS: O(V + E) - visits every vertex and edge once.");
    }
}