import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PartitionTest {

    List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5, 6, 7);


    @Test(expected = NullPointerException.class)
    public void testNullList() {
        List<List<Integer>> lists = Partition.partition(null, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyList() {

        List<List<Integer>> lists = Partition.partition(new ArrayList<>(), 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSize() {

        List<List<Integer>> lists = Partition.partition(liste, -3);
    }


    @Test
    public void testPartition1() {

        List<Integer> subliste1 = Arrays.asList(1, 2, 3);
        List<Integer> subliste2 = Arrays.asList(4, 5, 6);
        List<Integer> subliste3 = Arrays.asList(7);
        List<List<Integer>> listExpected = Arrays.asList(subliste1, subliste2, subliste3);

        List<List<Integer>> lists = Partition.partition(liste, 3);
        assertEquals(listExpected, lists);

    }

    @Test
    public void testPartition2() {

        List<Integer> subliste1 = Arrays.asList(1, 2);
        List<Integer> subliste2 = Arrays.asList(3, 4);
        List<Integer> subliste3 = Arrays.asList(5, 6);
        List<Integer> subliste4 = Arrays.asList(7);
        List<List<Integer>> listExpected = Arrays.asList(subliste1, subliste2, subliste3, subliste4);

        List<List<Integer>> lists = Partition.partition(liste, 2);
        assertEquals(listExpected, lists);

    }


}
