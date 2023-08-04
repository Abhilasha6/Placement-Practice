class Solution {
    public int arrangeCoins(int n) {
        // int coins=0,nc=0;
        // for(int i=1;i<=n;i++)
        // {
        //     coins+=i;
        //     if(coins>n)
        //     {
        //     coins=coins-n;
        //     break;
        //     }
        //     else
        //     nc++;
        // }
        // return nc;

        long i;
        for( i=1;i*(i+1)/2<=n;i++);
        return (int)i-1;
    }
}