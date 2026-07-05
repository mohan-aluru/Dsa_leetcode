class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int low=1;
        int high=(int)Math.pow(10,7);
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(find(dist,hour,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(ans!=0){
            return ans;
        }
        return -1;
    }
    private boolean find(int[] dist,double hour,int h){
        double time=0.0;
        for(int i=0;i<dist.length;i++){
            double t=(double)dist[i]/h;
            if(i==dist.length-1){
             time+=t;
            }else{
                time+=Math.ceil(t);
            }
        }
        return time<=hour;
    }
}