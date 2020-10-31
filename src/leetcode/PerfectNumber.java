package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {

    public boolean isPerfectNumber(int num) {
        List<Integer> list = new ArrayList<Integer>();

        if (num <= 1) {
            return false;
        }

        int sqrtNum = (int) Math.sqrt(num);
        for (int i = 1; i <= sqrtNum; i++) {
            if (num % i == 0) {
                list.add(i);

                if (i != 1) {
                    int _i = num / i;
                    if (!list.contains(_i)) {
                        list.add(_i);
                    }
                }
            }
        }

        int sum = 0;
        for (int i : list) {
            sum += i;
        }

        return sum == num;
    }


    public static void main(String[] args) {
        PerfectNumber pn = new PerfectNumber();
        boolean flag = false;

        System.out.println(System.currentTimeMillis());
        flag = pn.isPerfectNumber(625);
        System.out.println(System.currentTimeMillis());


        System.out.println(flag);
    }
}
