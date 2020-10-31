package leetcode;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0, sum1 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += i;
            sum1 += nums[i];
        }

        return sum + nums.length - sum1;
    }

    public static void main(String[] args) {
        System.out.println("Missing Number");
        MissingNumber mn = new MissingNumber();

        int[] arr = {0, 1, 3};
        int num = mn.missingNumber(arr);
        System.out.println(num);
    }
}
