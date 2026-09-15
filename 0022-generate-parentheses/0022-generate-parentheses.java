class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        func(res,n,0,0,"");
        return res;
    }
    private void func(List<String> res,int n,int open,int close,String pares){
        if(pares.length()==n*2){
            res.add(pares);
            return ;
        }
        if(open<n)func(res,n,open+1,close,pares+"(");
        if(close<open)func(res,n,open,close+1,pares+")");
    }
}