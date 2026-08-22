class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int ar : arr){
            map.put(ar, map.getOrDefault(ar,0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for(int ar : map.values()){
            set.add(ar);
        }
        return map.size() == set.size();
    }
}