package Oracle;

public class ReverseSubstringBetweenParantheses {
    public String reverseParentheses(String s) {
        int begin = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                begin = i;
            }
            if (s.charAt(i) == ')') {
                end = i;
                return reverseParentheses(
                        s.substring(0, begin) + reverse(s.substring(begin + 1, end)) + s.substring(end + 1));
            }
        }
        return s;
    }

    private String reverse(String s) {
        StringBuffer sb = new StringBuffer();
        sb.append(s);
        return sb.reverse().toString();
    }
}
