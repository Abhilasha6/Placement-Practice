class Solution {
    public int compress(char[] chars) {
        String s="";       
        if(chars.length==1) return 1;
        
        //TLE
        // HashMap<Character, Integer> hm=new HashMap<>();
        // for(int i=0;i<chars.length;i++)
        // {
        //     if(hm.containsKey(chars[i]))
        //     hm.put(chars[i], hm.get(chars[i])+1);
        //     else
        //     hm.put(chars[i],1);
        // }

        // int []res=new int[hm.size()]; 
        // for (Map.Entry<Character, Integer> entry : hm.entrySet())
        // {
        //     if(entry%2==0)
        //     res[i]=hm.getKey();
        //     else
        //     res[i]=hm.getValue();
        // }
        // for (Map.Entry<Character, Integer> entry : hm.entrySet())
        // {
        //     s+=entry.getKey()+""+entry.getValue();
        // }
        
        int count=0; int j=0;
        for(int i=0;i<chars.length;i++)
        {
            if(i+1<chars.length && chars[i]==chars[i+1])
            {
                count++;
            }
            else{
                chars[j++]=chars[i];
                s+=count;
                chars[j++]=s.charAt(0);
                count=0;
            }
        }
        return chars.length;
    }
}