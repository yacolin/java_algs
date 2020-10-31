package leetcode;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    if (nums[j] <= nums[j + 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
                i--;
            }
        }
    }

    public void moveZeroes2(int[] nums){
        int i = 0;

        for (int n : nums) {
            if (n != 0) {
                nums[i++] = n;
            }
        }
        while (i < nums.length) nums[i++] = 0;
    }

    public static void main(String[] args) {
        System.out.println("Move Zeros");
        MoveZeroes mz = new MoveZeroes();
        int[] arr = {0, 0, 0, 3, 2};

        mz.moveZeroes2(arr);

        for (int i : arr) {
            System.out.printf("%4d", i);
        }


    }
}
