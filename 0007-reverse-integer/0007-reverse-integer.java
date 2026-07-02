class Solution {
    public int reverse(int x) {
       boolean negative=x<0;
         x = Math.abs(x);
       StringBuilder res=new StringBuilder(String.valueOf(x));
       res.reverse();
       try
       {
        int num=Integer.parseInt(res.toString());
        return negative?-num:num;
       }catch(Exception e)
       {
        return 0;
       }
    }
}