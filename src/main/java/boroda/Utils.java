package boroda;

public class Utils {

    public static int[] toFlatten(int[][] map) {
        int[] flatten = new int[map.length * map[0].length];
        int i = 0;
        for (int[] row : map) {
            for (int item : row) {
                flatten[i] = item;
                i++;
            }
        }
        return flatten;
    }

    public static int[][] toMap(int[] flatten) {
        int side = (int) Math.sqrt(flatten.length);
        int[][] map = new int[side][side];
        int currRow = 0;
        int b = 0;
        for (int i = 0; i < flatten.length; i++) {
            if (i % side == 0 && i != 0) {
                currRow++;
                b = 0;
            }
            map[currRow][b] = flatten[i];
            b++;
        }
        return map;
    }

    public static boolean intIsUnique(int num, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) count++;
        }
        return count == 1;
    }
}