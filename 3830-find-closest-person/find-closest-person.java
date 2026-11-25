class Solution {
    public int findClosest(int x, int y, int z) {
        int A = Math.abs(x-z);
        int B = Math.abs(y-z);

        if(A < B){
            return 1;
        }else if(A > B){
            return 2;
        }else{
            return 0;
        }
    }
}