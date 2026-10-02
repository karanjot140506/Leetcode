class Solution {
    public List<String> generateParenthesis(int n) {
    List<String> list=new ArrayList<>();
    backtrack(n-1,n,"(",list);
    return list;   
    }
    public void backtrack(int left,int right,String s,List<String> res){
        if(left==0 && right==0){
            res.add(s);
            return;
        }
        if(left>right){
            return;
        }
        if(left>0){
            backtrack(left-1,right,s+"(",res);
        }
        if(right>0){
            backtrack(left,right-1,s+")",res);
        }
    }
}