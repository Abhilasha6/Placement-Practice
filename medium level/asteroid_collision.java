class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        // st.push(asteroids[0]);
        for (int i = 0; i < asteroids.length; i++) {
            // for(int count=1;count<=i;count++)
            // if((asteroids[i]<0 && asteroids[i-1]>0)||(asteroids[i-1]<0 &&
            // asteroids[i]>0))
            // {
            // st.pop();
            // if(Math.abs(asteroids[i])!=Math.abs(asteroids[i-1]))
            // st.push(Math.max(asteroids[i], asteroids[i-1]));
            // else
            // st.pop();
            // }
            // else
            // st.push(asteroids[i]);

            if (!st.isEmpty() && st.peek() > 0 && asteroids[i] < 0) {
                if (Math.abs(asteroids[i]) == Math.abs(st.peek()))
                    st.pop();
                else if (Math.abs(asteroids[i]) > Math.abs(st.peek())) {
                    st.pop();
                    i--;
                }
            } else
                st.push(asteroids[i]);
        }
        int res[] = new int[st.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = st.get(i);
        return res;
    }
}