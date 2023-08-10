class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length, caneat=n/2, type=0;
        Set<Integer> set = new HashSet<Integer>();
        for(int i: candyType)
        {
            set.add(i);
        }
        type=set.size();
        if(type>=caneat)
        return caneat;
        // else if(type<caneat)
        else
        return type;
    }
}