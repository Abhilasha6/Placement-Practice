class RecentCounter {
ArrayList<Integer> calls;
    public RecentCounter() {
        calls=new ArrayList<>();    
    }
    
    public int ping(int t) {
        calls.add(t);
        int cnt=0;
        for(Integer call: calls)
        {
            if(t-call<=3000)
            cnt++;
        }
        return cnt;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */