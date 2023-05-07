class Solution {
    public boolean isPerfectSquare(int num) {
        // THIS CAN BE THE SOLTUION FOR O(1) T.C. BUT WE ARE NO ALLOWED TO USE THIS APPROACH IN THE Q.
        // if(Math.sqrt((double)num)*Math.sqrt((double)num) == num)
        // return true;
        // return false;

        if(num<=0) return false;
        if(num==1) return true;

        //CORRECT BUT HAS T.L.E ERROR
        // for(int i=2;i<=num/2;i++)
        // if(i*i == num)
        // return true;

        //USING BINARY SEARCH FOR FASTER CALCULATION
        //we use long & not double/float bcz we need larger integers only, not any decimal no.
        long low=2, high=num;
        while(low<high)
        {
            long mid= low+(high-low)/2;
            if(mid*mid==num) return true;
            else if(mid*mid > num)
            high=mid;
            else low=mid+1;
        }
        return false;
    }
}