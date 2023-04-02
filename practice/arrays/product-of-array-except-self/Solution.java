class Solution {

    /**
    * Solution with division
    */
    public int[] productExceptSelf(int[] nums) {
        
    }

    /**
    * Solution without division
    */
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] out = new int[len];

        out[0] = 1;

        for (int i = 1; i < len; i++) {
            out[i] = nums[i - 1] * out[i - 1];
        }

        int product = 1;
        for (int i = len - 1; i >= 0; i--) {
            out[i] = out[i] * product;
            product = product * nums[i];
        }
        return out;
    }
}