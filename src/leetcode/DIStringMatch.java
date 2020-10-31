package leetcode;

public class DIStringMatch {
    public int[] diStringMatch(String S) {
        int len = S.length();
        int[] arr = new int[len + 1];
        int max = len, min = 0;


        for (int i = 0; i < len; i++) {
            arr[i] = S.charAt(i) == 'D' ? max-- : min++;
        }
        arr[len] = max;
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("DI String Match");

        DIStringMatch DISM = new DIStringMatch();
        String s = "IDID";
        int[] arr = new int[s.length() + 1];

        arr = DISM.diStringMatch(s);

        for (int i : arr)
            System.out.printf("%4d", i);
    }
}
