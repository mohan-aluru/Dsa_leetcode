class Solution {
    public int largestInteger(int[] nums, int k) {
      Map<Integer,Integer> map=new TreeMap<>();
      int n=nums.length;
  for(int start=0;start<=n-k;start++){
    Set<Integer> s=new HashSet<>();
    for(int i=start;i<start+k;i++){
        s.add(nums[i]);
    }
    for(int j:s){
        map.put(j,map.getOrDefault(j,0)+1);
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