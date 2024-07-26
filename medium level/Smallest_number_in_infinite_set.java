// input = set of +ve int, set of instructions & input numbers
// if the set of +ve int already contains the input numbers then return null else push these number into min heap
// pop the first element of priority queue = min heap if its not empty otherwise return min-1 bcz min++ was done earlier

class SmallestInfiniteSet {

    int min;
    PriorityQueue<Integer> pq;

    public SmallestInfiniteSet() {
        min = 1;
        pq = new PriorityQueue<>();
    }

    public int popSmallest() {
        if (!pq.isEmpty())
            return pq.poll();

        min++;
        return min - 1;
    }

    public void addBack(int num) {
        if (!pq.contains(num) && min > num)
            pq.offer(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */