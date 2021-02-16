public class AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        int p1 = num1.length() - 1, p2 = num2.length() - 1;
        while (p1 >= 0 || p2 >= 0) {
            int n1 = p1 < 0 ? 0 : num1.charAt(p1) - '0';
            int n2 = p2 < 0 ? 0 : num2.charAt(p2) - '0';
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            sum %= 10;
            res.append(sum);
            p1--;
            p2--;
        }
        if (carry != 0) {
            res.append(carry);
        }
        return res.reverse().toString();
    }
}
