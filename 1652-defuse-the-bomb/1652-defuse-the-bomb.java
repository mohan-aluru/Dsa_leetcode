class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] res=new int[n];
        int index=0;
        if(k==0){
            return res;
        }
        if(k<0){
            for(int i=0;i<n;i++){
               int sum=0;
               for(int j=1;j<=-k;j++){
                sum+=code[(i-j+n)%n];
               }
               res[index++]=sum;
            }
            return res;
        }
        for(int i=0;i<n;i++){
            int sum=0;
           for(int j=i+1;j<=i+k;j++){
            sum+=code[j%n];
           }
           res[index++]=sum;
        }
        return res;
    }
}