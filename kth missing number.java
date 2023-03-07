class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> lpos = new ArrayList<Integer>();
        for(int idx:arr)
        lpos.add(idx);
        int cnt=0, i=1;
        while(cnt<k)
        {
            // if(i != arr[i-1]) time limit exceeded on doing this way
            if(!lpos.contains(i))
            {
                cnt++;
            }
            i++;
        }

//         List<Integer> lpos = new ArrayList<Integer>();
//         for(int i=0;i<1000;i++)
//         lpos.add(i+1);
// // System.out.println(lpos);
//         List<Integer> missing = new ArrayList<Integer>();

//         for(int i=0;i<arr.length;i++)
//         {
//             // if(lpos.get(i)!=arr[i])
//             // {
//             // cnt++;
//             // if(cnt==k)
//             //     return lpos.get(i);

// if(arr[i])

//             // lpos.remove(i);

//             // missing.add(lpos.get(i));
//             }
//         }
//         //  System.out.println(lpos.get(k));

        return --i;
    }
}