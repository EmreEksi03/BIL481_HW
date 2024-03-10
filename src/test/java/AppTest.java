import Main.App;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testEmptyArrays() {
        Integer[] arr1 = null;
        ArrayList<Integer> arr2 = null;
        int target = 5;
        int expectedCount = 0;

        int actualCount = App.findCommonElementsCount(arr1, arr2, target);

        assertEquals(expectedCount, actualCount, "Should return 0 for null arrays");
    }

    @Test
    public void testEmptyTargetList() {
        Integer[] arr1 = {1, 2, 3};
        ArrayList<Integer> arr2 = new ArrayList<>();
        int target = 2;
        int expectedCount = 0;

        int actualCount = App.findCommonElementsCount(arr1, arr2, target);

        assertEquals(expectedCount, actualCount, "Should return 0 for empty target list");
    }

    @Test
    public void testNoCommonElements() {
        Integer[] arr1 = {1, 3, 5};
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(2, 4, 6));
        int target = 7;
        int expectedCount = 0;

        int actualCount = App.findCommonElementsCount(arr1, arr2, target);

        assertEquals(expectedCount, actualCount, "Should return 0 for no common elements");
    }

    @Test
    public void testSingleCommonElement() {
        Integer[] arr1 = {1, 2, 3};
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(2, 4, 6));
        int target = 2;
        int expectedCount = 1;

        int actualCount = App.findCommonElementsCount(arr1, arr2, target);

        assertEquals(expectedCount, actualCount, "Should return 1 for single common element");
    }

    @Test
    public void testMultipleCommonElements() {
        Integer[] arr1 = {1, 2, 2, 3};
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(2, 4, 2));
        int target = 2;
        int expectedCount = 3;

        int actualCount = App.findCommonElementsCount(arr1, arr2, target);

        assertEquals(expectedCount, actualCount, "Should return count for multiple common elements");
    }
}
