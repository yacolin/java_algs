package leetcode;

public class XorOperation {
    public int xorOperation(int n, int start) {
        int ret = 0;

        for (int i = 0; i < n; i++) {
            int num = start + (i * 2);

            ret ^= num;
        }

        return ret;
    }

    public static void main(String[] args) {
        System.out.println("XorOperation");

        XorOperation xo = new XorOperation();

        int num = xo.xorOperation(10, 5);

        System.out.println(num);
    }
}
