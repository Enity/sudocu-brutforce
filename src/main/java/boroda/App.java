package boroda;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[][] sud = Creator.getRandom(9);
        Brutforcer brut = new Brutforcer(sud);
        for (int i = 0; i < 1000001; i++) {
            Creator.getRandom(9);
            System.out.println(i);
        }
    }

    private static void printSudocu(int[][] sudocu) {
        for (int[] row : sudocu)
            System.out.print(Arrays.toString(row) + "\n");
    }
}
