class Solution {
    public int missingMultiple(int[] nums, int k) {
      Set<Integer> s=new HashSet();
      for(int i:nums){
        s.add(i);
      } 
      int i=1;
    while(k<=100){
   if(!s.contains(k*i)){
    return k*i;
   }
   i++;
    }
    return -1;
    }
}