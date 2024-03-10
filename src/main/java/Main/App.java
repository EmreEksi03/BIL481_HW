package Main;

import java.util.*;

public class App {

    public static int findCommonElementsCount(Integer[] arr1, ArrayList<Integer> arr2, int target) {
        if (arr1 == null || arr2 == null) {
            return 0; // Return 0 for null arrays
        }

        int count = 0;
        Map<Integer, Integer> elementCount = new HashMap<>(); // Track element counts in arr1

        // Build a map to store the count of each element in arr1
        for (int num : arr1) {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }

        for (int num : arr1) {
            if (elementCount.get(num) > 0 && arr2.contains(num) && num == target) {
                count++;
                elementCount.put(num, elementCount.get(num) - 1); // Decrement element count in arr1
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(4);
        arr2.add(6);
        int target = 2;

        int commonCount = findCommonElementsCount(arr1, arr2, target);
        System.out.println("Number of common elements with value " + target + ": " + commonCount);
    }
}

