class Solution {
    public String convert(String s, int numRows) {
        String[] res=new String[numRows];
          if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        for(int i=0;i<numRows;i++){
            res[i]="";
        }
        int index=0;
        int i=0;
        int j=0;
        while(index<s.length()){
            while(index<s.length() && i<numRows){
                res[i]+=s.charAt(index++);
                i++;
            }
            i-=2;
            j++;
            while(index<s.length() && i>=0){
                 res[i]+=s.charAt(index++);
                 i--;
            }
            i=1;
            j--;
        }
        String ans="";
        for(int k=0;k<numRows;k++){
            ans+=res[k];
        }
        return ans;
    }
}