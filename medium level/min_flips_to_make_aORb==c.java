class Solution {
    public int minFlips(int a, int b, int c) {
        int count = 0, i = 0;
        // String n1=Integer.toBinaryString(a);
        // String n2=Integer.toBinaryString(b);
        // String n3=Integer.toBinaryString(c);
        // if((a||b)==c) return 0;
        // else
        // {
        // while(i<32){
        // if((n1.charAt(i)||n2.charAt(j)) == n3.charAt(k))
        // {i++; j++; k++;}
        // else
        // {
        // if(n1.charAt(i)=='0') n1.replace(n1.charAt(i),'1');

        // }
        // }

        // integer is max 32 bits out of which leftmost bit is sign bit so we check
        // upto 31 bits
        // remember: we are doing bitwise & |, not logical && ||
        // we do & operations to check what is the current digit 0/1
        // we right shift the digits by 1 to keep on checking the rightmost bits by
        // removing the checked bits from right side
        // if any one bit from a or b is not matching then do count+1
        while (i < 31) {
            if ((c & 1) == 0) {
                if ((a & 1) == 1)
                    count++;
                if ((b & 1) == 1)
                    count++;
            } else if ((a & 1) == 0 && (b & 1) == 0)
                count++;
            a >>= 1;
            b >>= 1;
            c >>= 1;
            i++;
        }
        return count;

    }
}