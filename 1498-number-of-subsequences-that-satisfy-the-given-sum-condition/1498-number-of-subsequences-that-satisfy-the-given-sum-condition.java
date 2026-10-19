class Solution {
    public int numSubseq(int[] nums, int target) {
    Arrays.sort(nums);
    int l=0;
    int r=nums.length-1;
    int M=1000_000_007;
    int ans=0;
    int[] pow=new int[nums.length];
    pow[0]=1;
    for(int i=1;i<nums.length;i++){
        pow[i]=2*pow[i-1];
        pow[i]%=M;
    }
    while(l<=r){
        if(nums[l]+nums[r]<=target){
            ans+=pow[r-l];
            ans%=M;//ans mimght overdlow
            l++;
        }else {
            r--;
        }
    }
    return ans;
    }
}