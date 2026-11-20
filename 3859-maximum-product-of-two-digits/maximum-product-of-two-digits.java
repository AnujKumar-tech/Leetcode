class Solution {
    public int maxProduct(int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(n != 0){
            int digit = n % 10;
            pq.offer(digit);
            if(pq.size() > 2){
                pq.poll();
            }
            n /= 10;
        }
        return pq.poll() * pq.poll();
    }
}