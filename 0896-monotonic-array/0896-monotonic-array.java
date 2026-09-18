class Solution {
    public boolean isMonotonic(int[] nums) {
       boolean flag1=true;
       boolean flag2=true;
       for(int i=0;i<nums.length-1;i++){
        if(!(nums[i]<=nums[i+1])){
            flag1=false;
        }
         if(!(nums[i]>=nums[i+1])){
            flag2=false;
        }
       } 
       
       
       return flag1 || flag2;
    }
}