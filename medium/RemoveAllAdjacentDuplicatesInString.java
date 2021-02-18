package medium;

public class RemoveAllAdjacentDuplicatesInString {

    class Pair {
        int count;
        char ch;

        public Pair(int count, char ch) {
            this.count = count;
            this.ch = ch;
        }
    }

    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<Pair>();
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty() || st.peek().ch != s.charAt(i)) {
                st.push(new Pair(1, s.charAt(i)));
            } else {
                if (++st.peek().count == k) {
                    st.pop();
                }
            }
        }
        String res = new String();
        while (!st.isEmpty()) {
            Pair temp = st.pop();
            while (temp.count > 0) {
                res = temp.ch + res;
                temp.count--;
            }
        }
        return res;
    }
}
