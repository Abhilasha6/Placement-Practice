class Solution {
    public int longestOnes(int[] nums, int k) {
        int n1 = 0, n0 = 0, maxlen = 0;
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                n1++;
            else
                n0++;
            while (n0 > k && i >= j)
                if (nums[j++] == 1)
                    n1--;
                else
                    n0--;
            maxlen = Math.max(i - j + 1, maxlen);

        }
        return maxlen;
    }
}