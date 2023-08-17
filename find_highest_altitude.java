class Solution {
    public int largestAltitude(int[] gain) {
        int altitudes[]=new int[gain.length+1];
        altitudes[0]=0;
        for(int i=0;i<gain.length;i++)
        {
            altitudes[i+1]=gain[i]+altitudes[i];
        }
        int maxalt=-100000;
        for(int i=0;i<altitudes.length;i++)
        {
            if(altitudes[i]>maxalt)
            maxalt=altitudes[i];
        }
        return maxalt;
    }
}