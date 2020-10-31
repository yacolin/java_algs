package leetcode;


public class BeautifulArray {


    public int[] beautifulArray(int N) {
        int[] arr = new int[N];

        int sum = ((1 + N) * N) / 2;

        for (int i = 2; i < N; i++) {
            if (2 * i != (i - 1) + (i + 1)) {

            }
        }

        return  arr;
    }

    public static void main(String[] args) {
        System.out.println("Beautiful Array");
    }
}
