import Main.App;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class AppTest {

    @Test
    public void testSearch_TargetExists() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        assertTrue(App.search(arr, 2));
    }

    @Test
    public void testSearch_TargetDoesNotExist() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        assertFalse(App.search(arr, 4));
    }

    @Test
    public void testSearch_NullArray() {
        assertFalse(App.search(null, 2));
    }

    @Test
    public void testSearch_EmptyArray() {
        ArrayList<Integer> arr = new ArrayList<>();
        assertFalse(App.search(arr, 2));
    }

    @Test
    public void testSearch_TargetExistsMultipleTimes() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        assertTrue(App.search(arr, 2));
    }
}
