package Oracle;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String[] newStr = s.toLowerCase().split(" |_|\\W+");
        String x = "";
        for (String st : newStr)
            x += st;
        int i = 0, j = x.length() - 1;

        while (i < j) {
            if (x.charAt(i++) != x.charAt(j--)) {
                return false;
            }

        }
        return true;
    }
}
