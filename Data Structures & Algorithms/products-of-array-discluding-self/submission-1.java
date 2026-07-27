class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        int preprod = 1, postprod = 1;
        pre[0] = 1;
        post[nums.length - 1] = 1;

        int[] result = new int[nums.length];
        for(int i = 1; i < nums.length; i++){
            pre[i] = preprod * nums[i-1];
            preprod = pre[i]; 
        }

        // for(int i = nums.length - 2; i >= 0; i--){
        //     post[i] = nums[i+1] * postprod;
        //     postprod = post[i]; 
        // }

        // for(int i = 0; i < nums.length; i++){
        //     result[i] = pre[i] * post[i]; 
        // }

        result[nums.length - 1] = pre[nums.length - 1];

        for(int i = nums.length - 2; i >= 0; i--){
            result[i] = nums[i+1] * postprod * pre[i];
            postprod =  nums[i+1] * postprod;
        }
        
        return result;
    }
}  
