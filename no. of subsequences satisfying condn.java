class Solution {
    public int numSubseq(int[] nums, int target) {
//         ArrayList<Integer> lst=new ArrayList<>();
//         int val1=nums[0];
//         double c=0;
//         int freq=1;
//         if(val1 <= target)
//         {
//                 c++;
//                 for(int i=1;i<nums.length;i++)
//                 {
//                     if(nums[i]==val1)
//                     freq++;
//                 }
//         }

//      // for(int i=0;i<nums.length;i++)
//      //         {
//      //             if(nums[i]+nums[i] <= target)
//      //             c++;
//      //         }

//         for(int i=0;i<nums.length;i++)
//         {
            
//             // if(val1+nums[i] <= target)
//             // {
//                 lst.add(nums[i]);
//             // }
//              if(Collections.max(lst) + val1 <= target)
//             {
//                 c++;
//             }
//             else{
//                 lst.clear();
//             }
           
//         }
//         if(freq >1)
//         return (int)((c+freq) % (Math.pow(10,9) + 7));

//         return (int)((c) % (Math.pow(10,9) + 7));
        
      Arrays.sort(nums);
    int c = 0, n = nums.length, low = 0, high = n - 1;
    int val[] = new int[n];
    val[0] = 1;
    for (int i = 1 ; i < n ; ++i) val[i] = val[i - 1] * 2 % (int)(Math.pow(10,9) + 7);
    while (low <= high) {
        if (nums[low] + nums[high] > target) high--;
        else c = (c + val[high - low++]) % (int)(Math.pow(10,9) + 7);
    } return c;
    }
}