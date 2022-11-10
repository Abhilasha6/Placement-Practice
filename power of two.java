class Solution {
    public boolean isPowerOfTwo(int n) {
      /*  for(int i=0;i<=n;i++)
            {
                if(Math.pow(2,i)==n)
                    return true;
            }
        return false;
        */
        if(n==1) // 2/2=1
            return true;
        if(n==0) //fraction 1/2
            return false;
        if(n%2!=0)
            return false;
        else{
            return isPowerOfTwo(n/2);
        }
    }
}