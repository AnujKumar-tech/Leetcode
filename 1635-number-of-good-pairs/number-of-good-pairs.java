class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int freq[] = new int[101];
        for(int a:nums){
            count += freq[a]++;
        }
        return count;
    }
}