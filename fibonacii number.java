class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        else if(n==1 || n==2) return 1;
        int a=0, b=1, c=1;
        a=b;b=c;
        for(int i=3;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c; 
        }
        return c;
    }
}