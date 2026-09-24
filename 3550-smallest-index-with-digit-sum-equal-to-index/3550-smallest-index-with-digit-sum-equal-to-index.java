class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int t=nums[i];
            int sum=0;
            while(t!=0){
                sum=sum+t%10;
                t/=10;
             //   System.out.println(sum);
            }
if(sum==i){
    return i;
}
        }
        return -1;
    }
}