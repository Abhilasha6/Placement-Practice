class Solution {
    public int findComplement(int num) {
        String binary=Integer.toBinaryString(num);
        String ans="";
        for(int i=0;i<binary.length();i++)
        {
            if(binary.charAt(i)=='1')
            ans+="0";
            else
            ans+="1";
        }
        int val=Integer.parseInt(ans,2);
        return val;
    }
}