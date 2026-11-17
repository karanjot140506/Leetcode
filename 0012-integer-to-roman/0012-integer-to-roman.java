class Solution {
    public String intToRoman(int num) {
    int[] integers={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] characters={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<characters.length;i++){
        while(num-integers[i]>=0){
            num=num-integers[i];
            sb.append(characters[i]);
        }
    }    
    return sb.toString();
    }
}