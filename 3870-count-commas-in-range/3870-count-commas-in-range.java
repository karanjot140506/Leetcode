class Solution {
    public int countCommas(int n) {
    long total = 0;
        for(int d = 1; d <= 18; d++){
            long start = (long)Math.pow(10, d-1);
            if(start > n)  break;
            long end = Math.min(n, (long)Math.pow(10, d)-1);
            long count = end - start + 1;
            int commas = (d -1)/3;
            total += count*commas;
        }
        return (int)(long)total;
    }
}