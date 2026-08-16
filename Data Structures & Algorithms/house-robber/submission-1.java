class Solution {
    public int rob(int[] nums) {
        int max = 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);

        max = findMax(nums, 0, dp);
        return max;
    }

    int findMax(int[] nums, int i, int[] dp){
        if(i > nums.length - 1)
            return 0;
        
        if(dp[i] != -1)
            return dp[i];

        //robbing ith
        int answer = nums[i] + findMax(nums, i+2, dp);

        //skipping ith
        return dp[i] = Math.max(answer, findMax(nums, i+1, dp));
    }
}
