class Solution {
    public int climbStairs(int n) {
        if(n<=2)
            return n; //till here max 2 ways are possible 1+1 or only 2
        else
        {
           // int ways=1, count=0, sum=2;
           // for(int i=0;i<n;i++){
            //    if(count+1==n||count+2==n){
              //      ways++;
                //    count++;
            int ways = 2, prev = 1, count = 0; //basically sum keeps on incrementing when we keep on adding 1 or 2
            for (int i = 2; i < n; i++) {
            count = ways; 
            ways += prev;
            prev = count;
        }
        return ways;
        }
    }
}