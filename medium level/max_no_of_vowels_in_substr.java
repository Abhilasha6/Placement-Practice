class Solution {
    public int maxVowels(String s, int k) {
        if (s.length() < k)
            return 0;
        s = s.toLowerCase();
        int max = 0;
        for (int i = 1; i <= s.length() - k + 1; i++) {
            String substr = s.substring(i - 1, i + k - 1);
            int count = 0;
            for (int j = 0; j < substr.length(); j++)
                if (substr.charAt(j) == 'a' || substr.charAt(j) == 'e' || substr.charAt(j) == 'i'
                        || substr.charAt(j) == 'o' || substr.charAt(j) == 'u')
                    count++;

            if (count > max)
                max = count;
        }
        return max;
    }
}