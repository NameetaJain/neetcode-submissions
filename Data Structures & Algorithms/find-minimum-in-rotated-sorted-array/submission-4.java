class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1, mid = 0;

        if(nums.length == 1)
            return nums[0];

        if(nums[start] < nums[end]) //array is not rotated
            return nums[start];

        while(start <= end){
            mid = (start + end)/2;

            if(mid > 0 && nums[mid] < nums[mid-1] )
                return nums[mid];
            if(nums[end] > nums[mid])
                end = mid - 1;
            else if(nums[end] < nums[mid])
                start = mid + 1;
        }

        return 0;
    }
}
