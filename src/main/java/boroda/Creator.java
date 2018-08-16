package boroda;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Creator {

    public static int[][] getRandom(int size) {
        int[] map = new int[size * size];
        ArrayList<Integer> heap = getHeap(size);
        for (int i = 0; i < map.length; i++) {
            int randIndex = ThreadLocalRandom.current().nextInt(0, heap.size());
            map[i] = heap.get(randIndex);
            heap.remove(randIndex);
        }
        return Utils.toMap(map);
    }

    private static ArrayList<Integer> getHeap(int size) {
        ArrayList<Integer> heap = new ArrayList<Integer>();
        int current = 1;
        for (int i = 0; i < size * size; i++) {
            if (i % size == 0 && i != 0)
                current += 1;
            heap.add(current);
        }
        return heap;
    }
}