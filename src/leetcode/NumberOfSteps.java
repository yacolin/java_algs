package leetcode;

public class NumberOfSteps {

    public int numberOfSteps (int num) {
        int steps = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {
        NumberOfSteps nos = new NumberOfSteps();

        int steps = nos.numberOfSteps(123);
        System.out.println(steps);
    }
}
