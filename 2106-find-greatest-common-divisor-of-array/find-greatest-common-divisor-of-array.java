class Solution {
    public int findGCD(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(largest < nums[i]){
                largest = nums[i];
            }if(smallest > nums[i]){
                smallest = nums[i];
            }
        }
        return gcd(largest,smallest);
    }
    private int gcd(int a, int b){
        while(b != 0){
            int rem = a % b;
            a = b; b = rem;
        }
        return a;
    }
}