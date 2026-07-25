class Solution {
    public int maxProduct(int n) {
    int m1 = 0,m2 = 0;
    while(n > 0) {
        int digit = n % 10;
        if(digit > m1) {
            m2 = m1;
            m1 = digit;
        }
        else if(digit > m2) {
            m2 = digit;
        }
        n /= 10;
    }
    return m1 * m2;
    }
}