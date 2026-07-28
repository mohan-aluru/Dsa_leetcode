class Solution {
    public String smallestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
       for(char c:s.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
       }
       StringBuilder left=new StringBuilder();
       String middle="";
       for(char c='a';c<='z';c++){
        int freq=map.getOrDefault(c,0);
        for(int k=0;k<freq/2;k++){
           left.append(c);
        }
        if(freq%2==1){
            middle=String.valueOf(c);
        }
       }
       String right=new StringBuilder(left).reverse().toString();
       return left.toString()+middle+right;
    }
}