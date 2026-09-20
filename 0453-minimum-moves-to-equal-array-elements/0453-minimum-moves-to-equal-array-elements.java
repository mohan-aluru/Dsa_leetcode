class Solution {
    public int minMoves(int[] nums) {
        int minel=Integer.MAX_VALUE;
        for(int i:nums){
            minel=Math.min(minel,i);
        }int count=0;
    for(int i=0;i<nums.length;i++){
    count+=nums[i]-minel;
    }
return count;
    }
}