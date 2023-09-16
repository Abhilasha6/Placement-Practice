import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int ans[] = new int[temperatures.length];
        // correct but has TLE
        // for (int i = 0; i < temperatures.length - 1; i++) {
        // while (i < temperatures.length - 1 && temperatures[i + 1] < temperatures[i])
        // ans[i + 1] += 1;

        // optimised solution
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!st.empty() && temperatures[st.peek()] < temperatures[i])
                ans[st.peek()] = i - st.pop();

            st.push(i);
        }
        ans[temperatures.length - 1] = 0;
        return ans;
    }
}