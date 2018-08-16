package boroda;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest {

    @Test
    public void testFlatten() {
        int[][] data = {
            { 5, 6, 7 },
            { 8, 2, 1 },
            { 8, 2, 3 }
        };
        int[] expect = {5,6,7,8,2,1,8,2,3};
        assertArrayEquals(expect, Utils.toFlatten(data));
    }

    @Test
    public void testMap() {
        int[] data = {5,6,7,8,2,1,8,2,3};
        int[][] expect = {
            { 5, 6, 7 },
            { 8, 2, 1 },
            { 8, 2, 3 }
        };
        assertArrayEquals(expect, Utils.toMap(data));
    }
}
