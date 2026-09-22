class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        int r=0;
        while(r<nums.length-2){
         if(nums[r]==0){  
              nums[r]=nums[r]^1;
              nums[r+1]=nums[r+1]^1;
              nums[r+2]=nums[r+2]^1;
           
           count++;
         }
           r++;
        }
        if(nums[nums.length-1]==0 || nums[nums.length-2]==0)return -1;
        return count;
    }
}