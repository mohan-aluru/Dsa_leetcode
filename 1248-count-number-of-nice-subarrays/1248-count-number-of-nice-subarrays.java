class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countsub(nums,k)-countsub(nums,k-1);
    }
    static int countsub(int[] nums,int k){
        int count=0;
        int sum=0;
        int l=0;
        int r=0;
        while(r<nums.length){
            sum+=(nums[r]%2);
            while(sum>k){
                sum-=(nums[l]%2);
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }
}