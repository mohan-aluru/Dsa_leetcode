class Solution {
    public boolean checkDivisibility(int n) {
       if(n<10){
        return false;
       }
        int sum=0;
        int p=1;
        int t=n;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            p*=rem;
            n/=10;
        }
      return t%(sum+p)==0;
        }
}