class Solution {
    public long maxScore(int[] speed, int[] efficiency, int k) {
// public long maxScore(int[] nums1, int[] nums2, int k) {
    // int max1=Integer.MIN_VALUE(),max2=Integer.MIN_VALUE(),max3=Integer.MIN_VALUE();
    // for(int i=0;i<nums1.length-1;i++)
    {
        // for(int j=0;j<k;j++)
        // {
        //     int sum1=nums1[i]+nums1[i+1]+nums1[i+2];
        //     int sum2=nums2[i]+nums2[i+1]+nums2[i+]
        //     if()
        // }
        // if(nums1[i+1]>=nums1[i])
        // max1=nums1[i+1];
        // if(max1<max2)
        // {
        //     int temp=max1;
        //     max1=max2;
        //     max2=temp;
        // }
        // if(max2<max3)
        // {
        //     int temp=max2; max2=max3;max3=temp;
        // }
    //     if(nums1[i]>=max1)
    // }
     int n = speed.length;
    int[][] ess = new int[n][2];
    for (int i = 0; i < n; ++i)
        ess[i] = new int[] {efficiency[i], speed[i]};
    Arrays.sort(ess, (a, b) -> b[0] - a[0]);
    PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> a - b);
    long res = 0, sumS = 0;
    for (int[] es : ess) {
        pq.add(es[1]);
        sumS = (sumS + es[1]);
        if (pq.size() > k) sumS -= pq.poll();
        if (pq.size() == k) res = Math.max(res, (sumS * es[0]));
    }
    return res;
    }
}
}