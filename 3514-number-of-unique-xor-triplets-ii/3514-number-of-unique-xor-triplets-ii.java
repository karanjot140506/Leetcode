class Solution {
    public int uniqueXorTriplets(int[] nums) {
    final int MAX_XOR = 2048;
    boolean[] pairxor = new boolean[MAX_XOR];
    boolean[] tripletxor = new boolean[MAX_XOR];
    int n = nums.length;
    for(int i = 0; i < n; i++) {
        for(int j = i; j < n; j++) {
            pairxor[nums[i] ^ nums[j]] = true;
        }
    }    
    for(int x = 0; x < MAX_XOR; x++) {
        if(!pairxor[x])   continue;
        for(int v : nums) {
            tripletxor[x^v] = true;
        }
    }
    int c = 0;
    for(boolean exists : tripletxor) {
        if(exists)  c++;
    }
    return c;
    }
}