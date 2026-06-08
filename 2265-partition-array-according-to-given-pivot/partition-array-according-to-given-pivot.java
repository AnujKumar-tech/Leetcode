class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int ans[] = new int[n];

        int start = 0;
        int end = n-1;

        int i = 0;
        int j = n - 1;

        while(i < n){
            if(nums[i] < pivot){
                ans[start++] = nums[i];
            }
            if(nums[j] > pivot){
                ans[end--] = nums[j];
            }
            i++;
            j--;
        }
        while(start <= end){
            ans[start++] = pivot;
        }
        return ans;
    }
}