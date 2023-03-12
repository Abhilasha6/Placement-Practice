public class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> sl=new ArrayList<>();
        ArrayList<Character> tl=new ArrayList<>();
        // int flag=0;

        if(s.length()!=t.length())
        return false;

        // for (char ch : t.toCharArray()) {
        //     tl.add(ch);
        // }

        // for (char ch : s.toCharArray()) {
        //     sl.add(ch);
        // }

        // for(int i=0;i<s.length();i++)
        // {
        //     if(!sl.contains(tl.get(i)))
        //         flag++;
        //     tl.set(i,'0');
        // }
        // if(flag==0)
        // return true;
        // return false;
        
        
        
        // for(int i=0;i<26;i++){
        //     sl.add('0');
        //     tl.add('0');
        // }
        // ArrayList<Character> al = new ArrayList<>();
        // for (int i = 0; i < s.length(); i++) {
        //     sl.add(s.charAt(i));
        // }
        // HashMap<Character, Integer> hms = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        //     hms.putIfAbsent(sl.get(i),
        //                    Collections.frequency(sl,sl.get(i)));
        // }
        // for (int i = 0; i < t.length(); i++) {
        //     tl.add(t.charAt(i));
        // }
        // HashMap<Character, Integer> hmt = new HashMap<>();
        // for (int i = 0; i < t.length(); i++) {
        //     hmt.putIfAbsent(tl.get(i),
        //                    Collections.frequency(tl,tl.get(i)));
        // }
        // for(int i=0;i<s.length();i++)
        // if(hmt.equals(hms))return true;
        // return false;


        int freqs[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            freqs[t.charAt(i)-'a']+=1;
        }
        
        int[] freqt = new int[26];
        for(int i=0;i<t.length();i++){
            freqt[s.charAt(i)-'a']+=1;
        }
        for(int i=0;i<freqt.length;i++){
            if(freqs[i]!=freqt[i]){
                return false;
            }
        }
        return true;
    }
} {
    
}
