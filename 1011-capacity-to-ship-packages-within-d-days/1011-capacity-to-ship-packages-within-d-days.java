class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int w:weights){
            low=Math.max(low,w);
            high+=w;
        }
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(find(weights,days,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    private boolean find(int[] weights,int days,int cap){
        int d=1;
        int curr=0;
        for(int w:weights){
            if(w+curr>cap){
                d++;
                curr=w;
            }else{
                curr+=w;
            }
        }
        return d<=days;
    }
}