class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String prev=strs[0];
        String last=strs[strs.length-1];
        String res="";
        for(int i=0;i<prev.length();i++)
        {
            if(prev.charAt(i)!=last.charAt(i))
            {
                break;
               
            }
             res+=prev.charAt(i);
        }
        return res;
    }
}