package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();

            for (long j = 1, k = 1; j <= i; j++) {
                list.add((int)k);
                k = k * (i - j) / j;
            }
            result.add(list);
        }

        return  result;
    }

    public List<Integer> getRow(int rowIndex) {
        int i = rowIndex + 1;
        List<Integer> list = new ArrayList<>();
        for (long j = 1, k = 1; j <= i; j++) {
            list.add((int)k);

            k = k * (i - j) / j;
        }
        return list;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = new PascalTriangle().generate(31);
        List<Integer> result2 = new PascalTriangle().getRow(30);

//        System.out.println(result);
        System.out.println(result2);
    }
}
