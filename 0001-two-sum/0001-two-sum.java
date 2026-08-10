class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];
            if (map.containsKey(c)) {
                return new int[] { map.get(c), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    // for(int i=0;i<nums.length;i++){
    //     for(int j=i+1;j<nums.length;j++){
    //         if(nums[j]==target-nums[i]){
    //             return new int[]{i,j};
    //         }
    //     }
    // }    
    // return new int[]{1,1};
    }
}