package leetcode;

public class ClimbStairs {

    public int climbStair(int n) {

        if (n == 1 || n == 2) {
            return n;
        }

        int pre = 2;
        int beforePre = 1;

        int temp;

        for (int i = 3; i <= n; i++) {
            temp = pre;
            pre = pre + beforePre;
            beforePre = temp;
        }

        return pre;
    }

    public int climbStair2(int n) {
        if (n == 1 || n== 2) {
            return n;
        }

        return climbStair2(n - 1) + climbStair2(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Climb Stairs");
        ClimbStairs cs = new ClimbStairs();

        System.out.println(System.currentTimeMillis());
        int count = cs.climbStair(45);
        System.out.println(System.currentTimeMillis());
        System.out.println(count);

        System.out.println();

        System.out.println(System.currentTimeMillis());
        int count1 = cs.climbStair2(45);
        System.out.println(System.currentTimeMillis());
        System.out.println(count1);

    }
}
