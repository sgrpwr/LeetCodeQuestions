class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return converytBst(nums, 0, nums.length-1);
    }

    public TreeNode converytBst(int[] nums, int left, int right){
        if(left>right) return null;
        int mid = (right+left)/2;
        TreeNode newNode = new TreeNode(nums[mid]);
        newNode.left = converytBst(nums, left, mid-1);
        newNode.right = converytBst(nums, mid+1, right);
        return newNode;
    }
}
