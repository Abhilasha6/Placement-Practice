class Solution {
    public int longestSubarray(int[] nums) {
        int ind2 = 0, max = 0, count = 0;
        for (int ind1 = 0; ind1 < nums.length; ind1++) {
            if (nums[ind1] == 0) {
                count++;
            }
            while (count > 1) {
                if (nums[ind2] == 0)
                    count--;

                ind2++;
            }
            if (ind1 - ind2 > max)
                max = ind1 - ind2;
            // else
            // count=0;
            // if(count>=max)
            // max=count;
            // if(count>=max2 && count<max)
            // max2=count;
            // ind2=i-count+1;
            // if(ind2-ind1==2)
            // {
            // return max+max2;
            // }
            // else
            // {
            // ind1=ind2; max=max2; max2=0; ind2=0;
            // }
            // else if(i>0 && i<nums.length-1 && nums[i-1]==1 && nums[i+1]==1)
            // count++;
        }
        return max;

    }
}