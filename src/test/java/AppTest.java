import Main.App;
import org.testng.annotations.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class AppTest {

    @Test
    public void testComputationWithPositiveNumbers() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        String str1 = "Hello";
        String str2 = "World";
        assertEquals(135, App.performComputation(list1, list2, str1, str2));
    }

    @Test
    public void testComputationWithNegativeNumbers() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(-2);
        list1.add(3);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(-5);
        String str1 = "Hello";
        String str2 = "World";
        assertEquals(-135, App.performComputation(list1, list2, str1, str2));
    }

    @Test
    public void testComputationWithEmptyLists() {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        String str1 = "Hello";
        String str2 = "World";
        assertEquals(0, App.performComputation(list1, list2, str1, str2));
    }

    @Test
    public void testComputationWithEmptyStrings() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        String str1 = "";
        String str2 = "";
        assertEquals(0, App.performComputation(list1, list2, str1, str2));
    }

    @Test
    public void testComputationWithNullLists() {
        ArrayList<Integer> list1 = null;
        ArrayList<Integer> list2 = null;
        String str1 = "Hello";
        String str2 = "World";
        assertEquals(0, App.performComputation(list1, list2, str1, str2));
    }
}
