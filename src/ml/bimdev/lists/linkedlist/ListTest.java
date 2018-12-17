package ml.bimdev.lists.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ListTest {
    MyLinkedList<Integer> list;

    @Before
    public void setup() {
        list = new MyLinkedList<>();
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(16);
        list.add(32);
        list.add(64);
    }

    @Test
    public void testAddAndGet() {
        list.add(128);
        Arrays.toString(list.toArray());
        Assert.assertEquals(new Integer(128), list.get(6));
    }

    @Test
    public void testRemove() {
        list.remove(1);
        Assert.assertEquals(new Integer(8), list.get(1));
    }

    @Test
    public void testContainsTrue() {
        Assert.assertTrue(list.contains(32));
    }

    @Test
    public void testContainsFalse() {
        Assert.assertFalse(list.contains(18));
    }

    @Test
    public void testSizeGrow() {
        int oldSize = list.size();
        list.add(200);
        Assert.assertEquals(oldSize + 1, list.size());
    }

    @Test
    public void testSizeWane() {
        int oldSize = list.size();
        list.remove(4);
        Assert.assertEquals(oldSize - 1, list.size());
    }

    @Test
    public void testToArray() {
        Integer[] expectedArray = {2, 4, 8, 16, 32, 64};
        Assert.assertArrayEquals(expectedArray, list.toArray());
    }
}
