class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    //     int maxlen=0;
    //  for(int i=0;i<nums.length;i++)
    //  {
//          if(nums[i]==1)
//          {
//          maxlen++;
// System.out.println(maxlen);
//          }
//          else
//          maxlen=0;
// if(nums[i]==0)
// maxlen=0;
// maxlen++;
//      }   
//      return maxlen;

        int max = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                if(i != nums.length - 1) continue;
            }
            if(count > max) max = count;
            count = 0;
        }
        return max;
    }
}