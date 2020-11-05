package leetcode;

public class NimGame {

    public boolean canWinNim(int n) {

        return (n % 4) != 0;
    }

    public static void main(String[] args) {
        NimGame ng = new NimGame();

        boolean isWin = ng.canWinNim(4);
        System.out.println(isWin);
    }
}
