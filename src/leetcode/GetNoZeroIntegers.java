package leetcode;

public class GetNoZeroIntegers {
    public int[] getNoZeroIntegers(int n) {
        int[] arr = new int[2];

        for (int i = 1; i < n; i++) {
            int num1 = i, num2 = n - i;

            if (isContainZero(num1) || isContainZero(num2)) {
                continue;
            }

            if (num1 % 10 != 0 && num2 % 10 != 0) {
                arr[0] = num1;
                arr[1] = num2;
                break;
            }
        }
        return arr;
    }



    public boolean isContainZero(int num) {
        boolean flag = false;
        int _num = num;

        while (_num >= 10) {
            if (_num % 10 == 0) {
                flag = true;
                break;
            }
            _num = _num / 10;
        }

        return flag;
    }

    public static void main(String[] args) {
        GetNoZeroIntegers gzt = new GetNoZeroIntegers();

        int[] arr = gzt.getNoZeroIntegers(1010);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
