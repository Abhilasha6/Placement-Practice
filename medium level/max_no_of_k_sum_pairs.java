import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {
        int max = 0;

        // TLE

        // for(int i=0;i<nums.length-1;i++)
        // {
        // for(int j=i+1;j<nums.length;j++)
        // {
        // if(nums[i]+nums[j]==k && nums[i]!=-1 && nums[j]!=-1)
        // {
        // nums[i]=-1;
        // nums[j]=-1;
        // max++;
        // }
        // }
        // }

        // using binary searh algo & 2 pointers
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] == k && nums[i] != -1 && nums[j] != -1) {
                nums[i] = -1;
                nums[j] = -1;
                max++;
                i++;
                j--;
            } else if (nums[i] + nums[j] < k) {
                i++;
            } else
                j--;
        }
        return max;
    }
}