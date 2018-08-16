package boroda;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[][] sud = Creator.getRandom(9);
        Brutforcer brut = new Brutforcer(sud);
        for (int i = 0; i < 1000; i++) {
            sud = brut.brutforce();
        }
        printSudocu(sud);
    }

    private static void printSudocu(int[][] sudocu) {
        for (int[] row : sudocu)
            System.out.print(Arrays.toString(row) + "\n");
    }
}
