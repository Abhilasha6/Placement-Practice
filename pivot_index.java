class Solution {
    public int pivotIndex(int[] nums) {
        // for(int k=0;k<nums.length-1;k++)
        // {
        //     int pivot=k, leftsum=0, rightsum=0;
        //     for(int i=0,j=nums.length-1;i<j;i++,j--)
        //     {
        //         leftsum+=nums[i];
        //         rightsum+=nums[j];
        //     }
        //     if(leftsum==rightsum)
        //     return pivot;
        //     if(leftsum==0 && rightsum==0)
        //     return 0;
        // }




        //logic = rightsum=totalsum-leftsum-pivot
        int totalsum=0, leftsum=0; 
        for(int i=0;i<nums.length;i++)
        totalsum+=nums[i];
        for(int i=0;i<nums.length;i++)
        {
            if(leftsum==totalsum-leftsum-nums[i]) // check leftsum==rightsum, use rightsum formula instead of again calculating it
            return i;

            leftsum+=nums[i];
        }
    return -1;
    }
}