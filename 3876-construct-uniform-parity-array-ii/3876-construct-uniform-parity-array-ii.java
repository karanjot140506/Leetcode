class Solution {
    public boolean uniformArray(int[] nums1) {
    int n=nums1.length;
    int minodd=Integer.MAX_VALUE;
    int mineven=Integer.MAX_VALUE;
        int oddcount=0;
        for(int num:nums1){
            if(num%2!=0){
                oddcount++;
                minodd=Math.min(minodd,num);
            }
            else{
                mineven=Math.min(mineven,num);
            }
        }
        if(oddcount==0)  return true;
        if(minodd<mineven)  return true;
        return false;
    }
}