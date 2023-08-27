class Solution {
    public boolean increasingTriplet(int[] nums) {

        //TLE ON BOTH APPROACHES

        // boolean flag=false;        
        // for(int i=0;i<nums.length-2;i++)
        // {
        // if(nums[i]<nums[i+1] && nums[i+1]<nums[i+2])
        // {
        // return true;
        // }

        // for(int j=i+1;j<nums.length-1;j++)
        // {
        // for(int k=j+1;k<nums.length-2;k++)
        // if(nums[i]<nums[j] && nums[j]<nums[k])
        // flag=true;
        // }

        // }

        int min = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE, c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= min)
                min = nums[i];

            else if (nums[i] <= min2)
                min2 = nums[i];

            else
                return true;
        }
        return false;
    }
}