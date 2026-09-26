class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                String temp="";
                i++;
                while(s.charAt(i)!=')'){
                    temp=temp+s.charAt(i);
                    i++;
                }
                if(map.containsKey(temp))
                sb.append(map.get(temp));
                else
                sb.append("?");
            }
            if(s.charAt(i)!=')')
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}