class Solution {
    public int missingMultiple(int[] nums, int k) {
      Set<Integer> s=new HashSet();
      for(int i:nums){
        s.add(i);
      } 
      int i=1;
      int c=s.size();
    while(c>=0){
   if(!s.contains(k*i)){
    return k*i;
   }
   i++;
   c--;
    }
    return -1;
    }
}