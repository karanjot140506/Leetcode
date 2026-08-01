class Solution {
    public boolean predictTheWinner(int[] nums) {
    int res = helper(nums,0,nums.length-1);
    return res >= 0;    
    }
    private int helper(int[] nums,int left,int right){
        if(left == right){
            return nums[left];
        }
        int pickleft = nums[left] - helper(nums,left+1,right);

        int pickright = nums[right] - helper(nums,left,right-1);
        
        return Math.max(pickleft, pickright);
    }
}