class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numsMap = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            int pair = target - nums[i];

            if(numsMap.containsKey(pair))
                return new int[]{numsMap.get(pair), i};
            else
                numsMap.put(nums[i], i);
        }

        return new int[]{};
    }
}
