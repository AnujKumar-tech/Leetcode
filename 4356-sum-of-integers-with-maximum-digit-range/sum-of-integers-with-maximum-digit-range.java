class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = -1;
        int sum = 0;
        
        for (int num : nums) {
            int currentRange = getDigitRange(num);
            
            if (currentRange > maxRange) {
                maxRange = currentRange;
                sum = num;
            } else if (currentRange == maxRange) {
                sum += num;
            }
        }
        
        return sum;
    }
    
    private int getDigitRange(int num) {
        int minDigit = 9;
        int maxDigit = 0;
        int temp = num;
        
        while (temp > 0) {
            int digit = temp % 10;
            if (digit < minDigit) minDigit = digit;
            if (digit > maxDigit) maxDigit = digit;
            temp /= 10;
        }
        
        return maxDigit - minDigit;
    }
}