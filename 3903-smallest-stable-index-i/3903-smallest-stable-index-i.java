class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if(nums.length==1){
            return nums[0]-nums[0]<=k?0:-1;
        }
        int n=nums.length-1;
        int[] right=new int[n+1];
        right[n]=nums[n];
        for(int i=n-1;i>=0;i--){
            right[i]=Math.min(right[i+1],nums[i]);
        }
        int left=0;
       
        for(int i=0;i<=n;i++){
             left=Math.max(left,nums[i]);
             if(left-right[i]<=k){
                return i;
             }
        }
        return -1;
    }
}