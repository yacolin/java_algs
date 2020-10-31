package leetcode;

public class CountOdds {

    public int countOdds(int low, int high) {
        int count = 0;

        int nums = high - low;

        if (low % 2 != 0) {
            nums = nums + 1;
        }

        int rest = nums % 2;
        count = nums / 2 + rest;

        return count;
    }

    public static void main(String[] args) {
        CountOdds co = new CountOdds();

        int nums = co.countOdds(3, 7);
        System.out.println(nums);
    }
}
