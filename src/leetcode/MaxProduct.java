package leetcode;

public class MaxProduct {
    public int maxProduct(int[] nums) {
        int max = 0;


        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int _max = (nums[i] - 1) * (nums[j] - 1);

                if (_max > max) {
                    max = _max;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max Product");

        int[] arr = { 3,7 };
        MaxProduct mp = new MaxProduct();

        int max = mp.maxProduct(arr);

        System.out.println(max);
    }
}
