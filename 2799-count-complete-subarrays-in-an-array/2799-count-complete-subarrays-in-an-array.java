class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){

            set.add(i);
        }
        int dis=set.size();
        Map<Integer,Integer> map=new HashMap<>();
        int l=0;
        int count=0;
        int distinct=0;
        for(int r=0;r<nums.length;r++){
         map.put(nums[r],map.getOrDefault(nums[r],0)+1);
         distinct=map.size();
         while(distinct==dis){
           count+=nums.length-r;
           int left=nums[l];
           map.put(left,map.get(left)-1);
           if(map.get(left)==0){
          map.remove(left);
          distinct--;
           }
           l++;
         }

        }
        return count;
    }
}