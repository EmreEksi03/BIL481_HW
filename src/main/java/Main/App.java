package Main;

import java.util.ArrayList;

public class App {

    public static int findCommonElementsCount(Integer[] arr1, ArrayList<Integer> arr2, int target) {
        int count = 0;

        // Check if both arrays are not null
        if (arr1 == null || arr2 == null) {
            return count;
        }

        // Iterate through arr1
        for (int num : arr1) {
            // Check if num exists in arr2 and is equal to target
            if (arr2.contains(num) && num == target) {
                count++;
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
