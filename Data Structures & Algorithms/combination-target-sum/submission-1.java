class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        dfs(nums, 0, target, new ArrayList<>());
        return result;
    }

    private void dfs(int[] nums, int start, int target, List<Integer> current){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(target < 0)
            return;

        for(int i = start; i < nums.length ; i++){
            current.add(nums[i]);

            dfs(nums, i, target - nums[i], current);

            current.remove(current.size()-1);
        }
    }
}
