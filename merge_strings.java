class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans=""; int i,j,k;
        // if(word1.length()<=word2.length())
        // {
            for( i=0,j=0,k=0;i<Math.min(word1.length(), word2.length())*2;i++)
            {
                if(i%2==0)
                ans+=word1.charAt(k++);
                else
                ans+=word2.charAt(j++);
            }
            if(word1.length()<=word2.length())
            ans+=word2.substring(j);
            else if(word2.length()<word1.length())
            ans+=word1.substring(k);       

        // }
        // else{
        //     for( i=0,j=0,k=0;i<word2.length()*2;i++)
        //     {
        //         if(i%2==0)
        //         ans+=word1.charAt(k++);
        //         else
        //         ans+=word2.charAt(j++);
        //     }
        //     ans+=word1.substring(k);       
        // }
        return ans;
    }
}