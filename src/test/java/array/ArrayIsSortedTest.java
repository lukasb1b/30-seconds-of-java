package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayIsSortedTest {
    @Test
    public void arrayIsSortedTest(){
        assertTrue(array.ArrayIsSorted.isSorted(new int[]{1, 2, 3}));
        assertFalse(array.ArrayIsSorted.isSorted(new int[]{1, 3, 2}));
    }
}
