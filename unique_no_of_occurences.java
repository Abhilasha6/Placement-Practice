class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        // Arrays.sort(arr);
        int count=0;
        for(int i:arr) 
        if(hm.containsKey(i))
        hm .put(i, hm.get(i)+1);
        else
        hm.put(i,1);
        for(Map.Entry<Integer,Integer> e: hm.entrySet())
            if(!set.add(e.getValue())) 
            return false;
        // for(int i=0;i<hm.size();i++)
        // {
        //     if(hm.getValue(hm.getKey(arr[i]))==)
        // }
        return true;
    }
}