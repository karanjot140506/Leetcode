class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
    HashMap<Integer, Integer> mp = new HashMap<>(); 
        for(int[] r: reservedSeats) {
            int row = r[0], seat = r[1]; 
            mp.merge(row, 1 << (10 - seat), (a, b) -> a | b);
        }
        int ans = (n - mp.size()) * 2; 
        int[] masks = {0b0111100000, 0b0000011110, 0b0001111000};

        for(int x: mp.values()) {
            for(int m: masks) {
                if((m & x) == 0) {
                    ans++; 
                    x |= m; 
                }
            }
        }
        return ans;    
    }
}