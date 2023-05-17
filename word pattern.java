// class Solution {
//     public boolean wordPattern(String pattern, String s) {
//         HashMap<String,String> hm=new HashMap<>();
//         String[] words = s.split("\\s+");

//         for(int i=0;i<pattern.length();)
//         {
//             if(hm.containsKey(pattern.charAt(i)))
//             {
//                 if(!hm.get(pattern.charAt(i)).equals(words[i++]))
//                 return false;
//             }
//             else{
//                 if(hm.containsValue(words[i]))
//                 return false;

//                 hm.put(pattern.charAt(i)+"",words[i++]);
//             }
//         }
//         return true;


class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> mp = new HashMap<>();
        char[] alpha = pattern.toCharArray();
        String[] words = s.split("\\s+");
        if(words.length!=pattern.length()) return false;
        int i=0;
        for(char ch : alpha){
            if(mp.containsKey(ch)){
                if(!mp.get(ch).equals(words[i++]))
                return false;
            }
            else{
                if(mp.containsValue(words[i]))
                return false;
                mp.put(ch,words[i++]);
            }
            
        }
        return true;
    }
}
//     }
// }