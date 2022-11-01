class Solution {
    public int titleToNumber(String columnTitle) {
        if(columnTitle==null) 
            return -1;
        else{
            char ch[]=columnTitle.toUpperCase().toCharArray();
            int prev=0; 
            //it is simliar to doing 24=2*20+4, here we do ab=1*26+2=28
            for(int i=0;i<ch.length;i++)
            {
                prev*=26;
                prev+=ch[i]-'A'+1; //for getting as A=1, B=2 ....
            }
            return prev;
        }
}
}