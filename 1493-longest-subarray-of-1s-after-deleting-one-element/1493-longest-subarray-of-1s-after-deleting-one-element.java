class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        int l=0;
        int flag=0;
        for(int r=0;r<nums.length;r++){
    if(nums[r]==0){
        flag++;
     //      max=Math.max(max,r-l);
    }
    while(flag>1){
        
        if(nums[l]==0){
            flag--;
        }
          
        l++;
    }
      max=Math.max(max,r-l);
    
        }
        return max;
    }
}