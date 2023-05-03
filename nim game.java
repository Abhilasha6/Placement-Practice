class Solution {
    public boolean canWinNim(int n) {
        //TLE-
        
        // if(n<=3 && n>0) return true;
        // for(int i=1;i<=n;i++)
        // {
        //     if(n%4==0)
        //     return false;
        // }
        // return true;

        if(n<=0) return false;
        return n%4!=0;
    }
}