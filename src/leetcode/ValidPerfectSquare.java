package leetcode;

public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        int halfNum = num / 2;

        if (num == 1) {
            return true;
        }
        for (int i = halfNum; i > 1; i--) {
            if ((i * i) == num) {
                return true;
            }
        }

        return false;
    }

    public boolean isPerfectSquare2(int num) {
        long low = 1, high = num, mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            if ((mid * mid) == num) {
                return true;
            } else if ((mid * mid) > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return  false;
    }


    public static void main(String[] args) {
        ValidPerfectSquare vps = new ValidPerfectSquare();
        boolean flag = false;

        flag = vps.isPerfectSquare2(2147483647);
        System.out.println(flag);
    }
}
