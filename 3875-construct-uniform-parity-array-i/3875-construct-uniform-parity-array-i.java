class Solution {
    public boolean uniformArray(int[] nums1) {
       int n=nums1.length;
        int evens=0;
        int odds=0;
        for(int num:nums1){
            if(num%2==0)  evens++;
            else  odds++;
        }
        boolean alleven=true;
        for(int num:nums1){
            if(num%2!=0){
                if(odds<2){
                    alleven=false;
                    break;
                }
            }
        }
        boolean allodd=true;
        for(int num:nums1){
            if(num%2==0){
                if(odds==0){
                    allodd=false;
                    break;
                }
            }
        }
        return alleven||allodd;
    }
}