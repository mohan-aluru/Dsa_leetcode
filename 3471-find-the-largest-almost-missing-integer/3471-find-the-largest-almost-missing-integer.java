class Solution {
    public int largestInteger(int[] nums, int k) {
      Map<Integer,Integer> map=new TreeMap<>();
      int n=nums.length;
      if(k==n){
        int max=-1;
        for(int i:nums){
            if(i>max){
                max=i;
            }
        }
        return max;
      }
  for(int start=0;start<=n-k;start++){
    for(int i=start;i<start+k;i++){
       map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    }
  }
int ans=-1;
for(Map.Entry<Integer,Integer> entry:map.entrySet()){
    if(entry.getValue()==1){
        ans=Math.max(ans,entry.getKey());
    }
}
return ans;
    }
}