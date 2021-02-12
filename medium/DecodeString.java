class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<StringBuilder> str = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int k = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + ch - '0';
            } else if (ch == '[') {
                count.push(k);
                str.push(curr);
                curr = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                StringBuilder decoded = str.pop();
                for (int i = count.pop(); i > 0; i--) {
                    decoded.append(curr);
                }
                curr = decoded;
            } else {
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}