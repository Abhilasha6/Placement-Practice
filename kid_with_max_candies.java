class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> lst=new ArrayList<Boolean>();
        int max=0;
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>max)
            max=candies[i];
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies >= max)
            lst.add(true);
            else
            lst.add(false);
        }
        return lst;
    }
}