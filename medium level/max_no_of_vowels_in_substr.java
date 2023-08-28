import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maxVowels(String s, int k) {
        if (s.length() < k)
            return 0;
        s = s.toLowerCase();
        int max = 0, count = 0;

        // TLE
        // for(int i=1;i<=s.length()-k+1;i++)
        // {
        // String substr=s.substring(i-1,i+k-1);
        // count=0;
        // for(int j=0;j<substr.length();j++)
        // if(substr.charAt(j)=='a'||substr.charAt(j)=='e'||substr.charAt(j)=='i'||substr.charAt(j)=='o'||substr.charAt(j)=='u')
        // count++;

        // if(count>max)
        // max=count;
        // }

        // keep vowels in set, check if character is a vowel from beginning do count++,
        // return max count
        // else do count--
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for (int i = 0; i < k; i++)
            if (vowels.contains(s.charAt(i)))
                count++;
        max = count;
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i - k)))
                count--;
            if (vowels.contains(s.charAt(i)))
                count++;
            max = count > max ? count : max;
        }
        return max;
    }
}