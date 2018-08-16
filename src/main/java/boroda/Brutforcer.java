package boroda;

public class Brutforcer {
    int[][] sudocu;

    public Brutforcer(int[][] sudocu) {
        this.sudocu = sudocu;
    }

    public int[][] brutforce() {
        for (int x = 0; x < this.sudocu.length; x++) {
            for (int y = 0; y < this.sudocu[x].length; y++) {
                if (checkField(x, y)) continue;
                int n = 1;
                while (!checkField(x, y)) {
                    if (n == 10) {
                        this.sudocu[x][y] = 0;
                        break;
                    }
                    this.sudocu[x][y] = n;
                    n++;
                }
            }
        }
        return this.sudocu;
    }

    private boolean checkField(int x, int y) {
        int target = this.sudocu[x][y];
        // check row
        if (!Utils.intIsUnique(target, this.sudocu[x])) {
            return false;
        }
        // check col
        int[] col = new int[9];
        for (int i = 0; i < this.sudocu.length; i++) {
            col[i] = this.sudocu[i][y];
        }
        if (!Utils.intIsUnique(target, col)) {
            return false;
        }
        return true;
    }
}