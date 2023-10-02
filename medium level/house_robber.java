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

        // here we check that: if we rob current house, will the sum be max or not
        // if yes then rob this home else skip this house and go for next house
        int sum = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            int currsum = max + nums[i];
            max = Math.max(max, sum);
            sum = currsum;
        }
        return Math.max(sum, max);
    }
}