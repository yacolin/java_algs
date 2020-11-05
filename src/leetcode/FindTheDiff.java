package leetcode;

public class FindTheDiff {
    public char findTheDifference(String s, String t) {
        int sumS = 0, sumT = 0;
        char ch;

        for (int i = 0; i <s.length(); i++) {
            sumS += Integer.valueOf(s.charAt(i));
        }

        for (int j = 0; j < t.length(); j++) {
            sumT += Integer.valueOf(t.charAt(j));
        }


        ch = (char) (sumT - sumS);
        return ch;
    }

    public char findTheDifference2(String s, String t) {
        return (char) (s + t).chars().reduce(0, (c, d) -> c ^ d);
    }

    public static void main(String[] args) {
        System.out.println("Find The Diff");

        FindTheDiff ftd = new FindTheDiff();
        char s = ftd.findTheDifference("abcd", "abced");
        char t = ftd.findTheDifference("abcd", "abced");

        System.out.println(s);
        System.out.println(t);
    }
}
