package leetcode;

public class MaximumProduct {
    public int maximumProduct(int[] nums) {
        int max = 1, _max= 1;
        int len = nums.length;

        QuickSort(nums, 0, len - 1);

        max = nums[len - 1] * nums[len - 2] * nums[len - 3];
        _max = nums[len - 1] * nums[0] * nums[1];

        max  = max > _max ? max : _max;

        return max;
    }

    public static void BubbleSort(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len - i; j++) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }

    public static void QuickSort(int[] nums, int low, int high) {
        int i, j, index;
        if (low > high) {
            return;
        }
        i = low;
        j = high;

        index = nums[i];
        while (i < j) {
            while (i < j && nums[j] >= index)
                j--;
            if (i < j)
                nums[i++] = nums[j];
            while (i < j && nums[i] < index)
                i++;
            if (i < j)
                nums[j--] = nums[i];
        }
        nums[i] = index;
        QuickSort(nums, low, i - 1);
        QuickSort(nums, i + 1, high);
    }

    public static void Print(int[] nums) {
        for (int i : nums)
            System.out.println(i);
    }

    public static void main(String[] args) {
        System.out.println("MaximumProduct");
        MaximumProduct mp = new MaximumProduct();

        int[] arr = { -4,-3,-2,-1,60 };

        int max = mp.maximumProduct(arr);
        Print(arr);
        System.out.println(max);
    }
}
