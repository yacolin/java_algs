package leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        int result = n;

        do {
            int num = 0;
            int rest = result % 10;
            int _result = result / 10;


            num += rest * rest;

            while (_result >= 10) {
                int _rest = _result % 10;
                _result = _result / 10;

                num += _rest * _rest;
            }

            num += _result * _result;
            result = num;
        } while (result >= 10);

        return result == 1;

    }

    public boolean isHappy2(int n) {
        Set<Integer> set = new HashSet<Integer>();

        while (n > 1) {
            int m = 0;

            while (n > 0) {
                int d = n % 10;
                m += d * d;
                n /= 10;
            }

            if (set.contains(m))
                return false;

            set.add(m);

            n = m;
        }

        return true;
    }




    public static void main(String[] args) {
        HappyNumber hn = new HappyNumber();

        boolean flag = hn.isHappy2(1111111);
        System.out.println(flag);
    }
}
