class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++){

            if(i > 0 && nums[i] == nums[i-1])
                continue;
            int start = i+1, end = nums.length - 1;
            while(start < end){
                int n1 = nums[i];
                int n2 = nums[start];
                int n3 = nums[end];
                int sum = n1 + n2 + n3;

                if(sum == 0) {
                    result.add(new ArrayList<Integer>(List.of(n1, n2, n3)));
                    start++;
                    end--;

                    while((start < end) && nums[start] == nums[start-1])
                        start++;
                    while((start < end) && nums[end] == nums[end+1])
                        end--;

                }
                else if(sum < 0)
                    start++;
                else
                    end--; 
            }
        }
        return result;
    }
}
