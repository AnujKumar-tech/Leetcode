class Solution {
    public int smallestIndex(int[] nums) {
        int s,n;
        for(int i=0;i<nums.length;i++)
        {
            s=0;
            n=nums[i];
            while(n!=0)
            {
                s+=n%10;
                n/=10;
            }
            if(i==s)
            {
                return i;
            }
        }
        return -1;
    }
}