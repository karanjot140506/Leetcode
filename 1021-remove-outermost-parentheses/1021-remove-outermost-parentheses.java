class Solution {
    public String removeOuterParentheses(String s) {
    StringBuilder res=new StringBuilder();
    int count=0;
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='('){
            if(count>0){
                res.append(c);
            }
            count++;
        }
        else{
            count--;
            if(count>0){
                res.append(c);
            }
        }
    }    
    return res.toString();
    }
}