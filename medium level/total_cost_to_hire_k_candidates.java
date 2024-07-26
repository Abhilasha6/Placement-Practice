class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int left = 0, right = costs.length - 1;
        long cost = 0;

        PriorityQueue<Integer> pql = new PriorityQueue<>();
        PriorityQueue<Integer> pqr = new PriorityQueue<>();

        for (int i = 1; i <= k; i++) {
            while (left <= right && pql.size() < candidates)
                pql.offer(costs[left++]);

            while (left <= right && pqr.size() < candidates)
                pqr.offer(costs[right--]);

            int vall = Integer.MAX_VALUE, valr = Integer.MAX_VALUE;
            if (pql.size() > 0)
                vall = pql.peek();
            if (pqr.size() > 0)
                valr = pqr.peek();

            if (vall <= valr) {
                cost += vall;
                pql.poll();
            } else {
                cost += valr;
                pqr.poll();
            }
        }
        return cost;
    }
}