class Solution {
    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> ans=new ArrayList<List<Integer>>();
//        int val=1;
//        if(numRows==1)
//            return 1;
/*        List<Integer> ll=new ArrayList<Integer>();
        for(int i=0;i<numRows;i++)
        {
            ll.add(0,1);
            for(int j=1;i<ll.size()-1;j++)
                ll.set(j, ll.get(j)+ll.get(j+1));
            ans.add(new ArrayList<Integer>(ll));
        }
        return ans;
*/        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
	ArrayList<Integer> ll = new ArrayList<Integer>();
	for(int i=0;i<numRows;i++)
	{
		ll.add(0, 1);
		for(int j=1;j<ll.size()-1;j++)
			ll.set(j, ll.get(j)+ll.get(j+1));
		ans.add(new ArrayList<Integer>(ll));
	}
	return ans;
    }
}