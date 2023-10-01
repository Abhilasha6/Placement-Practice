class Solution {
    // in this question we have to find the max money that can be robbed
    // but we have to avoid robbing consecutive homes
    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        // we sum up the odd index nos and even index nos so that we avoid robbing
        // shows error if we need skipping >2 houses to find max
        // consecutive homes
        // int sume=0, sumo=0;
        // for(int i=0;i<nums.length;i++)
        // {
        // if(i%2==0)
        // sume+=nums[i];
        // else
        // sumo+=nums[i];
        // }
        // return Math.max(sume, sumo);

    }
}