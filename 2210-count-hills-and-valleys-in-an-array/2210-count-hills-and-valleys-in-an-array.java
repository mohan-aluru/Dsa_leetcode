class Solution {
    public int countHillValley(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]==nums[i-1]){
             continue;
            }
               int left=i-1;
                int right=i+1;
                while(right<nums.length && nums[i]==nums[right]){
                    right++;
                }
             //   if(right<nums.length && (nums[left]<nums[i] && nums[i]>nums[right]) || (nums[left]>nums[i] &&  nums[i]<nums[right])){
               //     count++;
                //}
                 if (right < nums.length &&
                ((nums[i - 1] < nums[i] && nums[i] > nums[right]) ||
                 (nums[i - 1] > nums[i] && nums[i] < nums[right]))) {
                count++;
            }
        }
        return count;
    }
}