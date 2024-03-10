package Main;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        String str1 = "Hello";
        String str2 = "World";
        int result = performComputation(list1, list2, str1, str2);
        System.out.println("Result: " + result);
    }

    public static int performComputation(ArrayList<Integer> list1, ArrayList<Integer> list2, String str1, String str2) {
        // Perform a computation using the provided parameters
        int result = 0;

        // Example computation: Multiply the lengths of the strings by the sum of elements in the lists
        result = (str1.length() * str2.length()) * (sumArray(list1) + sumArray(list2));

        return result;
    }

    // Utility method to calculate the sum of elements in an ArrayList<Integer>
    private static int sumArray(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}
