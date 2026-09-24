class Solution {
    public int numberOfSubstrings(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int ans=0;
        int l=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
       map.put(c,map.getOrDefault(c,0)+1);
       while(map.size()>=3){
           // ans += s.length() - r;
             map.put(s.charAt(l),map.get(s.charAt(l))-1);
             if(map.get(s.charAt(l))==0){
                map.remove(s.charAt(l));
             }
             l++;
          }
          ans+=l;
        }
          
        return ans;
    }
}