
         class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int left = 0;
        long sum = 0;
        long ans = 0;

        for (int right = 0; right < nums.length; right++) {
         sum+=nums[right];
         map.put(nums[right],map.getOrDefault(nums[right],0)+1);
         while(map.get(nums[right])>1){
            int temp=nums[left];
            sum-=nums[left];
            map.put(temp,map.get(temp)-1);
            if(map.get(temp)==0){
                map.remove(temp);
            } 
             left++;
         }
         while(map.size()>k){
             int temp=nums[left];
            sum-=nums[left];
            map.put(nums[left],map.get(nums[left])-1);
            if(map.get(nums[left])==0){
                map.remove(nums[left]);
            } 
             left++;
         }
         if(right-left+1==k){
               ans=Math.max(ans,sum);  
         }
         
        }
     return ans;
}
        }
       