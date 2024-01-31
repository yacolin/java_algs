package leetcode.Parenttheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static List<String>  generateParenthesis(int n) {
        List<String> arr = new ArrayList<>();

        dfs(n, n, "", arr);

        return arr;
    }

    public static void dfs(int left, int right, String str, List<String> arr) {
        if (left == 0 && right == 0) {
            arr.add(str);
        }

        if (left > 0) {
            dfs(left - 1, right, str + '(', arr);
        }

        if (left < right) {
            dfs(left, right - 1, str + ')', arr);
        }
    }

    public static void main(String[] args) {
        List<String> result = generateParenthesis(3);

        for (String str : result ) {
            System.out.println(str);
        }
        System.out.println("generateParenthesis");
    }
}
