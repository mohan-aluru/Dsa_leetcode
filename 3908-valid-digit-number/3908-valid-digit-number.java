class Solution {
    public boolean validDigit(int n, int x) {
     int flag=0;
     int s=0;
        while(n>0){
            s=n;
            if(x==n%10){
              flag=1;  
            }
            n=n/10;
        }
  if(s!=x && flag==1){
    return true;
  }
        return false;
    }
}