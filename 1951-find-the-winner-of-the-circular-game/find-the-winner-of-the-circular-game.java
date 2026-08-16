class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> circle = new ArrayList<>();
        for(int i=1;i<=n;i++){
            circle.add(i);
        }
        int curr_idx = 0;
        while(circle.size() > 1){
            int next_to_remove = (curr_idx + k - 1) % circle.size();
            circle.remove(next_to_remove);
            curr_idx = next_to_remove;
        }
        return circle.get(0);
    }
}