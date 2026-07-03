class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);//look at the problem since the visualization is in sorted order we need to sort to get solution
        int n=position.length;
   int low=1;
   int high=position[n-1]-position[0];
   int ans=-1;
   while(low<=high){
    int mid=low+(high-low)/2;
    if(find(position,m,mid)){
         ans=mid;
         low=mid+1;
    }else{
        high=mid-1;
    }
   }
   return ans;
    }
    private boolean find(int[] position,int m,int d){
        int pos=position[0];
        int balls=1;
        for(int i=1;i<position.length;i++){
            if(position[i]-pos>=d){
                balls++;
                pos=position[i];
            }
            if(balls>=m)return true;
        }
       return false;
    }
}