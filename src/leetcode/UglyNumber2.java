package leetcode;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class UglyNumber2 {
    public int nthUglyNumber(int n) {
        int[] factors = {2, 3, 5};
        Set<Long> seen = new HashSet<Long>();
        PriorityQueue<Long> heap = new PriorityQueue<Long>();
        seen.add(1L);
        heap.offer(1L);
        int ugly = 0;
        for (int i = 0; i < n; i++) {
            long curr = heap.poll();
            ugly = (int) curr;
            for (int factor : factors) {
                long next = curr * factor;
                if (seen.add(next)) {
                    heap.offer(next);
                }
            }
        }
        return ugly;
    }


    public static void main(String[] args) {
        UglyNumber2 un2 = new UglyNumber2();

        int number = un2.nthUglyNumber(10);
        System.out.println(number);
    }
}
