class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> lst1 = new ArrayList<Integer>();
        List<Integer> lst2 = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> hs1 = new HashSet<Integer>();
        Set<Integer> hs2 = new HashSet<Integer>();

        for (int i = 0; i < nums1.length; i++)
            hs1.add(nums1[i]);
        for (int i = 0; i < nums2.length; i++)
            hs2.add(nums2[i]);

        for (int i : hs1) {
            if (!hs2.contains(i))
                lst1.add(i);
        }

        for (int i : hs2) {
            if (!hs1.contains(i))
                lst2.add(i);
        }
        ans.add(lst1);
        ans.add(lst2);
        return ans;

        // for(int i=0;i<nums1.length;i++)
        // {
        // for(int j=0;j<nums2.length;j++)
        // {
        // if(nums1[i]!=nums2[j])
        // lst1.add(nums1[i]);
        // }
        // }

        // for(int i=0;i<nums2.length;i++)
        // {
        // for(int j=0;j<nums1.length;j++)
        // {
        // if(nums2[i]!=nums1[j])
        // lst2.add(nums2[i]);
        // }
        // }
        // ans.add(lst1); ans.add(lst2);
        // return ans;
    }
}