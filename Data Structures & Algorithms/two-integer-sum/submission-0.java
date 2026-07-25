class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> smap = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            int n = target - nums[i];
            Integer index = smap.get(n);
            if(index != null){
                return new int[]{smap.get(n), i};
            } else {
                smap.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}
