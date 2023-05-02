// add digits of number until the number becomes < 9, ex-38=3+8=11=1+1=2 stop now ans=2
class Solution {
    public int addDigits(int num) {
        int sum;
        while(num>=9){
            
            int temp=num;
            sum=0;
            while(temp!=0)
            {
                sum+=temp%10;
                temp/=10;
            }
            if(sum<=9) return sum;
            num=sum;
        }
       return num; 
    }
}