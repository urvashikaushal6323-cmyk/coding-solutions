class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];        // Pehle half mein fill karo
            ans[i + n] = nums[i];    // Dusre half mein fill karo
        }
        
        return ans;
    }
}