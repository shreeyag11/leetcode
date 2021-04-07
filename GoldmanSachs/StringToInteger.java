package GoldmanSachs;

public class StringToInteger {
    public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        int result = 0;
        if (s.length() == 0)
            return 0;

        while (i < s.length() && s.charAt(i) == ' ')
            i++;

        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-'))
            sign = s.charAt(i++) == '-' ? -1 : 1;

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            if (result > Integer.MAX_VALUE / 10
                    || (result == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + (s.charAt(i++) - '0');
        }
        return result * sign;
    }
}
