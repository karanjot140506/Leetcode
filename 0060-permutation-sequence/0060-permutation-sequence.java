class Solution {
    public String getPermutation(int n, int k) {
     List<Integer> nums = new ArrayList<>();

        // Available numbers
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        // factorial = (n - 1)!
        int factorial = 1;
        for (int i = 1; i < n; i++) {
            factorial *= i;
        }

        // Convert k to 0-based
        k--;

        StringBuilder ans = new StringBuilder();

        for (int i = n; i > 0; i--) {

            int index = k / factorial;

            ans.append(nums.get(index));
            nums.remove(index);
             if (i > 1) {
                k %= factorial;
                factorial /= (i - 1);
            }
        }

        return ans.toString();    
    }
}