class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)==')'){
           StringBuilder sb=new StringBuilder();
           while(st.peek()!='('){
            sb.append(st.pop());
           }
           st.pop();
          
          for(int z=0;z<sb.length();z++){
            st.push(sb.charAt(z));
          }
           }
           else{
            st.push(s.charAt(i));
           }
        }
StringBuilder res=new StringBuilder();
      while (!st.isEmpty()) {
    res.append(st.pop());
}
        return res.reverse().toString();
    }
}