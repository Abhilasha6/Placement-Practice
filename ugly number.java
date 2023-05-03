class Solution {

    // public boolean isprime(int n){
    //     int cnt=0;
    //     for(int i=2;i<n;i++)
    //     {
    //         if(n%i==0)
    //         cnt++;
    //     }
    //     if(cnt!=0)
    //     return false;
    //     return true;
    // }

    public boolean isUgly(int n) {
     
        // int cnt=0;
        // ArrayList<Integer> primefact=new ArrayList<>();
        // for(int i=1;i<=n;i++)
        // {
        //     // if(n%i==0)
        //     // int cnt=primefact(i);
        //     for(int j=2;j<=i;j++)
        //     {
        //         if(j%i==0)
        //         cnt++;
        //     }
        //     if(cnt==2)
        //     primefact.add(i);
        //     // System.out.println(i);
        //     // primefact++;
        //     // if()
        // }
        // // if(primefact<=5)
        // // return true;
        // for(int i=0;i<primefact.size();i++)
        // {
        //     if(primefact.get(i)!=2 || primefact.get(i)!=3 || primefact.get(i)!=5) return false;
        //     // System.out.println(primefact.get(i));
        // }
        // return true;


// int pcnt=0;

if(n==1) return true;

//         for(int i=2;i<n;i++)
//         {
//             if(n%i==0)
//                  if(isprime(i)==true && i>5)
//                  {
//                     // System.out.println(i);
//                     pcnt++;

//                  }
            
//         }
//        if(pcnt!=0)
//        return false;
        
//         return true;

while(n>1){
            if(n%2 == 0){
                n = n/2;
            }
            else if(n%3 == 0){
                n = n/3;
            }
            else if(n%5 == 0){
                n = n/5;
            }
            else{
                return false;
            }
        }
        return n>0? true: false;
    }
}