class Solution {
    public int[] productExceptSelf(int[] nums) {
        
         int n = nums.length;
        int[] result = new int[n];

        // Product of elements on the left
        int left = 1;

        for (int i = 0; i < n; i++) {
            result[i] = left;
            left = left * nums[i];
        }

        // Product of elements on the right
        int right = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right = right * nums[i];
        }

        return result;
    }
}  
