class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        char op = ' ';
       long  res = 0;
         if (s.length() == 0) {
            return 0;
        }

        if (!Character.isDigit(s.charAt(0))
                && s.charAt(0) != '-'
                && s.charAt(0) != '+') {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
                op = s.charAt(i);
            } else if (Character.isDigit(s.charAt(i))) {
                int digit = s.charAt(i) - '0';
                long temp=res * 10 + digit;
                if(temp>Integer.MAX_VALUE){
                if(op=='-'){
                    return Integer.MIN_VALUE;
                }else{
                    return Integer.MAX_VALUE;
                }
                }
                res = temp;
            } else {
                break;
            }
        }

        if (op == '-') {
            return (int)-res;
        }
        return (int)res;
    }
}