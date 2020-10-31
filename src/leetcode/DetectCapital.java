package leetcode;

public class DetectCapital {

    public boolean detectCapitalUse(String word) {
        boolean flag = false;

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) < 91) {
                count++;
            }
        }

        if (count == 0) flag = true;
        if (count == word.length()) flag = true;
        if (count == 1 && word.charAt(0) < 91) flag = true;

        return flag;
    }


    public static void main(String[] args) {
        DetectCapital dc = new DetectCapital();
        String str = new String("FlaG");
        boolean flag = dc.detectCapitalUse(str);

        System.out.println(flag);
    }
}
