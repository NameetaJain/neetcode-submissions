class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        int start = 0, end = 0;
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i-1])
                continue;

            start = i+1;
            end = nums.length-1;
            while(start < end){
                int n = nums[i] + nums[start] + nums[end];

                if(n == 0){
                    result.add(new ArrayList(Arrays.asList(nums[i],nums[start],nums[end])));
                    start++;
                    end--;

                    while(start < end && nums[start] == nums[start-1])
                        start++;
                    
                    while(start < end && nums[end] == nums[end+1])
                        end--;
                }
                else if( n > 0)
                    end--;
                else
                    start++;
            }
        }
        return result;
    }
}
