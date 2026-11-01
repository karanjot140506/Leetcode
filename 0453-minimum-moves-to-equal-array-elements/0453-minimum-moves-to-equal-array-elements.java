class Solution {
    public int minMoves(int[] nums) {
    int sum = 0;
    int minval = Integer.MAX_VALUE;
    int n = nums.length;
    for(int num : nums){
        sum+=num;
        minval = Math.min(num,minval);
    }    
    return (sum-(n*minval));
    }
}