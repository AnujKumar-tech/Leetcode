class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();

        for(int i=0; i<k; i++){
            while(dq.size() > 0 && nums[dq.getLast()] <= nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for(int i=k; i<nums.length; i++){
            res.addLast(nums[dq.peek()]);

            while(dq.size() > 0 && dq.peek() <= i-k){
                dq.removeFirst();
            }
            while(dq.size() > 0 && nums[dq.getLast()] <= nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        res.addLast(nums[dq.peek()]);

        return res.stream().mapToInt(i->i).toArray();
    }
}