class Solution {
    public int arraySign(int[] nums) {
        
        // Used to count occurences of negative numbers in nums.
        int negativeNumCount = 0;
        
        // Iterate through the array of numbers (int[] nums).
        for (int num : nums) {
            // If we encounter a zero then the product must be zero.
            if (num == 0) return 0;
            // If we encounter a (-) number then we increment the count.
            if (num < 0) negativeNumCount++;
        }
        
        // If there is an even amount of (-) numbers then the product will be positve.
        // If there is an odd amount of (-) numbers then the product will be negative.
        return negativeNumCount % 2 == 0 ? 1 : -1;
    }
}
