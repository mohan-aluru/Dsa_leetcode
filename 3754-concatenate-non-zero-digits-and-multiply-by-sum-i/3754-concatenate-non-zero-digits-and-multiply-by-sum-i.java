class Solution {
    public long sumAndMultiply(int n) {
        if(n==0)return 0;
      int num=0; // StringBuilder s=new StringBuilder();
        while(n>0){
            int t=n%10;
            if(t!=0){
                //s.insert(0,t);
                num=num*10+t;
            }
            n=n/10;
        }
        long res=0;
        while(num>0){
         res=res*10+num%10;
         num=num/10;
        }
       // long res=Integer.parseInt(s.toString());
        long mul=res;
        long sum=0;
        while(res>0){
            int d=(int)res%10;
            sum+=d;
            res=res/10;
        }
        return (int)mul*sum;
    }
}