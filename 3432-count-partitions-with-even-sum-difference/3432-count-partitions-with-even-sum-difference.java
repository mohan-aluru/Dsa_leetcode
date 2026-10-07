class Solution {
    public int countPartitions(int[] nums) {
        int totalsum=0;
        for(int i:nums){
            totalsum+=i;
        }
        int leftsum=0;
        int rightsum=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
         leftsum+=nums[i];
         rightsum=totalsum-leftsum;
         int diff=Math.abs(rightsum-leftsum);
         if(diff%2==0){
           // System.out.println(diff);
            count++;
         }
        }
        return count;
    }
}