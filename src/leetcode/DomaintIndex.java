package leetcode;

public class DomaintIndex {
    public int dominantIndex(int[] nums) {
        int index = -1;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != index && max < nums[i] * 2) {
                index = -1;
                break;
            }
        }


        return index;
    }

    public static void main(String[] args) {
        System.out.println("DomaintIndex");

        DomaintIndex di = new DomaintIndex();
        int[] arr = { 1, 2, 3, 4 };


        int index = di.dominantIndex(arr);
        System.out.println(index);
    }
}
