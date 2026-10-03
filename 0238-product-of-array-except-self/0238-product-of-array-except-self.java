class Solution { 
    public int[] productExceptSelf(int[] nums) {
        int[] larr=new int[nums.length];
        int[] rarr=new int[nums.length];
         larr[0]=1;
         int p=1;
        for(int i=1;i<nums.length;i++){
            p=p*nums[i-1];
            larr[i]=p;
        }
         rarr[nums.length-1]=1;
         int rp=1;
        for(int i=nums.length-2;i>=0;i--){
         rp=rp*nums[i+1];
         rarr[i]=rp;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=larr[i]*rarr[i];
        }
        return nums;
    }
}