package leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr = new ArrayList<>();

        int max = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                arr.add(true);
            } else {
                arr.add(false);
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Kids With Candies");

        KidsWithCandies kwc = new KidsWithCandies();
        List<Boolean> arr = new ArrayList<>();

        int[] candies = { 12,1,12 };

        arr = kwc.kidsWithCandies(candies, 10);

        for (boolean i : arr)
            System.out.println(i);
    }
}
