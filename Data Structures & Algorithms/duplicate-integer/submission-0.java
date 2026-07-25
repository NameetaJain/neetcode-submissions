class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> count = new HashMap<>();

        for(int n : nums){
            if(count.containsKey(n))
                return true;
            else
                count.put(n,1);
        }

        return false;
    }
}