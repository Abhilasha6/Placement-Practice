class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        int nf=0, ans=0;
        for(int i=1;i<=n;i++)
        {
            if(n%(i)==0)
            {
                arr.add(i);
                nf++;
            }
            // if(nf==k)
            // ans=i;
        }
        if(nf<k) return -1;
        return arr.get(k-1);
    }
}