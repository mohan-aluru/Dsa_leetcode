class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=0;
        int ans=0;
        for(int i:nums){
            //low=Math.min(low,i);
            high=Math.max(high,i);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(find(nums,threshold,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    private boolean find(int nums[] ,int ts,int div){
        int sum=0;
        for(int i:nums){
            sum+=(int)Math.ceil((double)i/div);
        }
        return sum<=ts;
    }
}