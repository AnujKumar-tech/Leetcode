class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int tp = 0;
        int lp = 0;
        int rp = nums.size()-1;
        while(lp != rp){
            if(nums.get(lp)+nums.get(rp) < target){
                tp +=rp - lp;
                lp++;
            }else{
                rp--;
            }
        }
        return tp;
    }
}