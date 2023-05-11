class Solution {
    public boolean isPowerOfFour(int n) {
    //     if(n==1) return true;
    //     int flag=0;
    //    while(n!=0)
    //    {
    //     //    if(n%4<4 && n%4>0)
    //     if(n%4==0)
    //        {
    //            flag=1;
    //            break;
    //        }
    //        n/=4;
    //    }

    //    if(flag==1) return true;

    //    return false; 


if(n==0) return false;
if(n==1) return true;
if(n%4==0) return isPowerOfFour(n/4);
else return false;


//TIME LIMIT EXCEEDED
    // for(int i=0;;i++)
    // if(Math.pow(4,i)==n) return true;
    }
}