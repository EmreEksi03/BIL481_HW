package Main;

import java.util.ArrayList;

public class App {

    public static int findCommonElementsCount(Integer[] arr1, ArrayList<Integer> arr2, int target) {
        if (arr1 == null || arr2 == null) {
            return 0; // Return 0 for null arrays
        }

        int count = 0;
        boolean[] visited = new boolean[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            int num = arr1[i];
            if (!visited[i] && arr2.contains(num) && num == target) {
                count++;
                visited[i] = true; // Mark the element as visited in arr1
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

