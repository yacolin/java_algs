package leetcode;

public class ConstructRectangle {

    public int[] constructRectangle(int area) {
        int[] arr = new int[2];
        int diff = area - 1;

        for (int i = area; i >= Math.sqrt(area); i--) {
            if (area % i == 0) {
                int _diff = i - (area / i);

                if (_diff <= diff) {
                    arr[0] = i;
                    arr[1] = area / i;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Construct Rectangle");

        ConstructRectangle cr = new ConstructRectangle();
        int[] arr = new int[2];

        arr = cr.constructRectangle(18);
        for (int i : arr)
            System.out.printf("%4d", i);
    }
}
