class Solution {
    public String decodeString(String st) {
        Stack<Character> s=new Stack<>();
        for(char ch:st.toCharArray()){
            if(ch!=']'){
                s.push(ch);
            }else{
                 StringBuilder str=new StringBuilder();
                 while(s.peek()!='['){
                    str.insert(0,s.pop());
                 }
                 s.pop();
                 StringBuilder num=new StringBuilder();
                 while(!s.isEmpty() && Character.isDigit(s.peek())){
                    num.insert(0,s.pop());
                 }
                 int repeat=Integer.parseInt(num.toString());
                 StringBuilder r=new StringBuilder();
                 for(int i=0;i<repeat;i++){
                    r.append(str);
                 }
                 for(char c:r.toString().toCharArray()){
                    s.push(c);
                 }
            }

        }
        StringBuilder res=new StringBuilder();
        while(!s.isEmpty()){
            res.insert(0,s.pop());
        }
        return new String(res.toString());
    }
}