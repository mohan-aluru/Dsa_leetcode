class Solution {
    public double myPow(double x, int n) {

        long power = n;
        double res = 1;

        if (power < 0) {
            power = -power;
        }
while(power>0){
    if(power%2==1){
  res*=x;
  power--;
    }
    x=x*x;
    power=power/2;//here we are decrementing the power we have used in if condition but we dont want to mention that because we are cmputing the x value *res where one power gets reduced 
}
if(n<0){
    return 1/res;
}
        return res;
    }
}