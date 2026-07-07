class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int prefixsum=0;
        for(int i=0;i<nums.length;i++){
            prefixsum+=nums[i];
            int rem=prefixsum%k;
            if(map.containsKey(rem) && i- map.get(rem)>=2){
                return true;
            }else{
              if(!map.containsKey(rem))map.put(rem,i);
            }
        }
        return false;
    }
}