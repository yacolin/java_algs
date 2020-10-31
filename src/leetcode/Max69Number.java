package leetcode;

public class Max69Number {
    public int maximum69Number (int num) {
        int divisor = 1000;
        while(divisor > 0) {

            int temp = (num / divisor) % 10;
            if(temp == 6) {
                num += divisor * 3;
                return num;
            }
            divisor = divisor / 10;
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println("Max 69 Number");

        Max69Number mn = new Max69Number();
        int max = mn.maximum69Number(9669);

        System.out.println(max);
    }
}
