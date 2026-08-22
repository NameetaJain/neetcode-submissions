class Solution {
    public int maxSubArray(int[] nums) {
        int result = nums[0];

        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        dp[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);

            result = Math.max(result, dp[i]);
        }
        return result;
    }
}
