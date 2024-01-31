package leetcode;

public class isPalindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return  false;
        }

        int revertedNum = 0;
        while (x > revertedNum) {
            revertedNum = revertedNum * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNum || x == revertedNum / 10;
    }
    public static void main(String[] args) {
        int x = 123321;
        boolean result = isPalindrome(x);
        System.out.println(result);
    }
}
