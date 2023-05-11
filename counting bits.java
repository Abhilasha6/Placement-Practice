class Solution {

    public int[] countBits(int n) {

        // bruteforce solution: o(nlogn)
        int ans[] = new int[n + 1];
        int cnt = 0;
        for (int i = 0; i <= n; i++) {
            String bin = Integer.toBinaryString(i);
            long num = Long.parseLong(bin);
            cnt = 0;
            while (num != 0) {
                if (num % 10 == 1)
                    cnt++;
                num /= 10;
            }
            ans[i] = cnt;

            // char[] val = bin.toCharArray();
            // for(int j=0;j<val.length;j++)
            // if(val[j]==0)
            // cnt++;
            // ans[i]=cnt;
        }

        return ans;
    }

    // optimised solution:o(n)
    public vector<int> countBits(int n) {
            vector<int> ans(n+1,0);
            for(int i=1 ; i<=n ; i++){
               if(i%2 == 0){
                   ans[i] = ans[i/2];
               }
               else
                   ans[i]=ans[i-1]+1;
                }
                return ans;
    }
}