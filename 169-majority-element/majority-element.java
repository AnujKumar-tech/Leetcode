class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(Integer num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        Set<Integer> keySet = map.keySet();
        for(Integer key : keySet){
            if(map.get(key) > nums.length/2){
                return key;
            }
        }
        return 0;
    }
}