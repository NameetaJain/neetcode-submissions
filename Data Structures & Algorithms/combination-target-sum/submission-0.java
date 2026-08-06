class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> cur = new ArrayList<>();
        findCombinations(nums, 0, cur, target);
        return res;
    }

    private void findCombinations(int[] nums, int index, List<Integer> cur, int target){
        if(target == 0){
            res.add(new ArrayList<>(cur));
            return;
        }
        
        if(index >= nums.length || target < 0 )
            return;

        cur.add(nums[index]);
        findCombinations(nums, index, cur, target - nums[index]);
        cur.remove(cur.size()-1);

        findCombinations(nums, index+1, cur, target);
        return;
    }
}
