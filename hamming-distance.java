class Solution {
    public int hammingDistance(int x, int y) {
        int ans=x^y, count=0;
        String val=Integer.toBinaryString(ans);
        for(int i =0; i<val.length(); i++)
        {
            if(val.charAt(i)=='1')
            count++;
        }
        return count;
    }
}