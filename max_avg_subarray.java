class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0, maxavg = -1000000;
        if (nums.length == 1)
            return (double) nums[0];

        // correct but gives TLE for large input
        // for(int i=0;i<=nums.length-k;i++)
        // {
        // int j=i, count=1; sum=0;
        // while(count<=k)
        // {
        // sum+=nums[j++];
        // count++;
        // }
        // if(sum/k > maxavg)
        // maxavg=sum/k;
        // }

        // optimised soln.
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i >= k - 1) {
                maxavg = Math.max(sum / k, maxavg);
                sum -= nums[i - k + 1]; // subtract 1st elem of prev window
            }
        }
        return maxavg;
    }
}