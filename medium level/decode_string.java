import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ']')
                st.push(s.charAt(i));
            else {
                // find the substring within []
                String sub = "";
                while (!st.isEmpty() && Character.isLetter(st.peek()))
                    sub = st.pop() + sub;

                st.pop();// remove the [ after finding the substring

                // find the number if times we need to repeat the substring found
                String sb = "";
                while (!st.isEmpty() && Character.isDigit(st.peek()))
                    sb = st.pop() + sb;

                // append the subtrsing sb no. of times
                for (int j = Integer.valueOf(sb); j > 0; j--) {
                    for (char ch : sub.toCharArray())
                        st.push(ch);
                }
            }
        }
        // return all the letters in the stack
        String ans = "";
        while (!st.isEmpty() && Character.isLetter(st.peek()))
            ans = st.pop() + ans;
        return ans;
    }
}