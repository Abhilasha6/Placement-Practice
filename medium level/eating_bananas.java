// find the min val so that koko can eat all bananas along the piles within time 'h' hrs

// Given k, koko needs ceil(1.0 * piles[i] / k) to eat up all bananas in each piles[i]
// so given k, koko need hours = sum(math.ceil(1.0 * pile / k) for pile in piles) to eat up all the bananas from all piles.

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // sum=0, tc=0; int min=Integer.MAX_VALUE;
        // for(int i=0;i<piles.length;i++)
        // {
            // if(piles[i]<h)
            // min++;
            // else
            // {
            //     while(piles[i]>0)
            //     {
            //         piles[i]-=h;
            //         min++;
            //     }
            // }
        //     tc+=piles[i];
        // }
        // for(int i=1;i<piles.length;i++)
        // {
        //     tc=Math.ceil(piles[i]/i);
        //     sum+=tc;
        //     if(sum<min)
        //     min=(int)sum;
        // }
        // return min;

        int mid=0, low=1, high=1000000000, tc=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            tc=0;
            for(int i=0;i<piles.length;i++)
            tc+=Math.ceil(1.0*piles[i]/mid);
            if(tc>h)
            low=mid+1;
            else
            high=mid-1;
        }
        return low;
    }
}