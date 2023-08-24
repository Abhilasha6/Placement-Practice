class Solution {
    public String reverseWords(String s) {
        
        // TLE

        // s+=" ";
        // String ans="";
        // for(int i=0;i<s.length();i++)
        // {
        //     String word="";
        //     while(s.charAt(i)!=' ')
        //     {
        //         word+=s.charAt(i);
        //     }
        //  ans=word+""+ans;   
        // }
        // return ans;

        // String[] words=s.trim().split(" ");
        // String ans="";
        // for(int i=words.length-1;i>=0;i--)
        // {
        //     if(words[i]!=" ")
        //     ans+=words[i]+" ";
        // }
        // return ans.trim();

        StringBuilder sb=new StringBuilder();
        int len=s.length();
        for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)==' '){
        sb.append(s.substring(i,len));
        len=i;
        }
        }
        sb.append(' '+s.substring(0,len));
        return sb.toString().replaceAll("\s+"," ").trim();
    }
}