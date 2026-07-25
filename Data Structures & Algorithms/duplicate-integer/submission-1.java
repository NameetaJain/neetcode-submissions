class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> intSet = new HashSet<>();

        for(int n : nums){
            if(!intSet.add(n))
                return true;
        }

        return false;
    }
}