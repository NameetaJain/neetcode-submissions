class Solution {
    public int rob(int[] nums) {
        int result = 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return robRec(nums, 0, dp);
    }

    private int robRec(int[] nums, int i, int[] dp){
        if(i >= nums.length)
            return 0;
        
        if(dp[i] != -1)
            return dp[i];

        dp[i] = Math.max(nums[i]+ robRec(nums, i+2, dp),
                            robRec(nums, i+1, dp));
        
        return dp[i];
    }
}
