class Solution {
    public int maxOperations(int[] nums, int k) {
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == k && nums[i] != -1 && nums[j] != -1) {
                    nums[i] = -1;
                    nums[j] = -1;
                    max++;
                }
            }
        }
        return max;
    }
}