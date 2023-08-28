class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        if(n==2) return Math.min(height[0], height[1]);
        int area=0, max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                area=(j-i)*height[j];
                if(area > max && height[j]<=height[i])
                max=area;
            }
        }
        return max;
    }
}