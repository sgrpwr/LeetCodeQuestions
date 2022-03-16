class Solution {
    public int singleNumber(int[] nums) {

        /*
         * Rule 1: any number Xor with itself becomes 0 (ex- x^x=0)
         * Rule 2: Any number Xor with 0 becomes the number only (x^0=x)
         */
        int ans = 0;
        for(int num: nums){
            ans ^= num;
        }
        return ans;
    }
}