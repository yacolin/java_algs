package leetcode;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int pairs = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    pairs++;
                }
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        System.out.println("leetcode.NumberOfGoodPairs");

        NumberOfGoodPairs nogp = new NumberOfGoodPairs();
        int[] arr = {1,1,1,1};
        int pairs = nogp.numIdenticalPairs(arr);
        System.out.println(pairs);
    }
}
