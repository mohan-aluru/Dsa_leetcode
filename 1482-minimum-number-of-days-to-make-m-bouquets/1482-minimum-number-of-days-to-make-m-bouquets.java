class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if((long)m*k>n)return -1;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i:bloomDay){
        low=Math.min(low,i);
        high=Math.max(high,i);
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(find(bloomDay,m,k,mid))
              {
                ans=mid;
                high=mid-1;
              }
              else {
               low=mid+1;
              }
            
        }
       return ans; 
    }
    private boolean find(int[] bloomday,int m,int k,int d){
        int count=0;
        int b=0;
        for(int day:bloomday){
            if(day<=d){
                count++;
                if(count==k){
                    count=0;
                    b++;
                }
            }
            else{
                count=0;
            }
        }
        return b>=m;
    }
}