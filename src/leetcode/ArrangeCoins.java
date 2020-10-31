package leetcode;

public class ArrangeCoins {
    public int arrangeCoins(int n) {
        int i = 1;

        if (n == 0) return n;

        while (n >= 0 && i < n - i) {
            n = n - i;
            i++;
        }

        return i;
    }

    public static void main(String[] args) {
        System.out.println("Arrange Coins");

        ArrangeCoins ac = new ArrangeCoins();
        int n = ac.arrangeCoins(4);

        System.out.println(n);
    }
}
