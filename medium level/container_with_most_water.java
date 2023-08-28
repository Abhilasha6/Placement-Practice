class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        if (n == 2)
            return Math.min(height[0], height[1]);
        int area = 0, max = 0;
        for (int i = 0, j = n - 1; i < j;) {
            // for(int j=i+1;j<n-1;j++)
            // {
            area = (j - i) * Math.min(height[j], height[i]);
            max = area > max ? area : max;
            if (height[j] < height[i])
                j--;
            else if (height[j] > height[i])
                i++;
            else {
                i++;
                j--;
            }
            // }
        }
        return max;
    }
}