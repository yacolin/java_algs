package leetcode;

public class TrailingZeroes {

    public int trailingZeroes(int n) {
        int count = 0;
        int num = factorial(n);

        while (num % 10 == 0) {
            count++;
            num = num / 10;
        }

        return count;
    }


    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }


    public int trialingZeros2(int n) {
        int sum = 0;

        for (int i = 1; Math.pow(5, i) <= n; i++) {
            sum += n / Math.pow(5, i);
        }

        return sum;
    }

    public static void main(String[] args) {
        TrailingZeroes tz = new TrailingZeroes();
        int result = 0, count = 0;

        count = tz.trialingZeros2(20);
        System.out.println(count);
    }
}
