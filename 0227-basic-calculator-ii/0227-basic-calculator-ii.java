class Solution {
    public int calculate(String str) {
        Stack<Integer> s=new Stack<>();
        int num=0;
        char op='+';
        for(int i=0;i<=str.length();i++){
            char ch=(i==str.length())?'+':str.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch!=' '){
                if(op=='+'){
                    s.push(num);
                }else if(op=='-'){
                    s.push(-num);
                }else if(op=='*'){
                    s.push(s.pop()*num);
                }else if(op=='/'){
                    s.push(s.pop()/num);
                }
                op=ch;
                num=0;
            }
        }
        int ans=0;
        while(!s.isEmpty()){
         ans+=s.pop();
                 }
                 return ans;
    }
}