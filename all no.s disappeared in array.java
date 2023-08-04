class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        set.add(nums[i]);
        for(int i=1;i<=nums.length;i++)
        {
            // if(i!=nums[i])
            // {
            //     ans.add(i);
            //     i--;
            // }
            if(!set.contains(i))
            ans.add(i);
        }
        return ans;
    }
}