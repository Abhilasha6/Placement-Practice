class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length]; int prod=1;

        //TLE 
        // for(int i=0;i<nums.length;i++)
        // {
        //     prod=1;
            
        //     for(int j=0;j<nums.length;j++)
        //     if(j!=i)
        //     prod*=nums[j];

        //     ans[i]=prod;
        // }


        for(int i=0;i<nums.length;i++)
        {
            
                ans[i]=prod;
                prod*=nums[i];
            
        }
        prod=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            ans[i]*=prod;
            prod*=nums[i];
        }
        return ans;
    }
}