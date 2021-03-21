package GoldmanSachs;

public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                count += isPalindrome(s.substring(i, j)) ? 1 : 0;
            }
        }
        return count;
    }

    private boolean isPalindrome(String s) {
        if (s.length() == 0)
            return false;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }
}
