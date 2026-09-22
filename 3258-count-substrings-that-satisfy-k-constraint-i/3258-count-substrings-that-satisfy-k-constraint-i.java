class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int left=0;
        int zero=0;
        int one=0;
        int ans=0;
        for(int r=0;r<s.length();r++){
            if(s.charAt(r)=='0'){
                zero++;
            }else{
                one++;
            }
            while(zero>k&&one>k){//if particular substring has morenthan zeros and one then left poniter will be moved
            
    if(s.charAt(left)=='0')zero--;
    else one--;
    left++;
    
  }
  ans+=r-left+1;
            }

        
        return ans;
    }
}