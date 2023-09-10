class Solution {
    public String removeStars(String s) {
        Stack<Character> ch = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*')
                ch.pop();
            else
                ch.push(s.charAt(i));
        }
        String res = "";
        for (char c : ch) {
            res += c;
        }
        return res;
    }
}
