class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] square = new long[n];

        for(int i=0; i<nums.length; i++){
            square[i] = (long)nums[i]*nums[i];
        }
        Arrays.sort(square);
        long score = 0;

        for(int i=0; i<n/2; i++){
            score -= square[i];
        }
        for(int i=n/2; i<n; i++){
            score += square[i];
        }
        return score;
    }
}