class Solution {
    public int minMoves(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(Integer num : nums){
            sum += num;
            if(num > max){
                max = num;
            }
        }
        return max * nums.length - sum;
    }
}