import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) { 
        if(s.length()==1 )return 1;
        Set<Character> set=new HashSet<>();
      int l=0;
      int maxlen=0;
      for(int r=0;r<s.length();r++){ 
        char c=s.charAt(r);
        while(set.contains(c)){
            set.remove(s.charAt(l));
            l++;
        }
        maxlen=Math.max(maxlen,r-l+1);
        set.add(c);
      }
      return maxlen;
    }
}
