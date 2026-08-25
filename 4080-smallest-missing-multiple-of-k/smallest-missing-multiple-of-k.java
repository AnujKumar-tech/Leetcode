class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for(Integer num : nums){
            set.add(num);
        }
        int res = k;
        while(set.contains(res)){
            res += k;
        }
        return res;
    }
}