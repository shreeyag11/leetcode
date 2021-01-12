public class RemoveAllAdjacentDup {
        public String removeDuplicates(String S) {
            Stack<Character> st = new Stack<>();
            for(int i = 0; i < S.length(); i++) {
                if(!st.isEmpty() && st.peek() == S.charAt(i)) {
                    st.pop();
                }
                else 
                    st.push(S.charAt(i));
            }
            String res = "";
            while(!st.isEmpty()){
                res = st.pop() + res;
            }
            return res;
        }
}
