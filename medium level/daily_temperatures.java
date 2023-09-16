class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int ans[] = new int[temperatures.length];
        for (int i = 0; i < temperatures.length - 1; i++) {
            while (i < temperatures.length - 1 && temperatures[i + 1] < temperatures[i])
                ans[i + 1] += 1;

        }
        ans[temperatures.length - 1] = 0;
        return ans;
    }
}