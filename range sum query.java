class NumArray {
    int obj1[];
    public NumArray(int[] nums) {
        obj1 = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        obj1[i]=nums[i];
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        
        for(int i=left;i<=right;i++)
        sum+=obj1[i];

        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */