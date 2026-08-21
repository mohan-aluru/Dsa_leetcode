class Solution {
    public int[] resultArray(int[] nums) {
    if(nums.length==1){
        return new int[]{nums[0]};
    }
    LinkedList<Integer> l1=new LinkedList<>();
       LinkedList<Integer> l2=new LinkedList<>();
       l1.add(nums[0]);
       l2.add(nums[1]);
       for(int i=2;i<nums.length;i++){
            int el=nums[i];
            if(l1.peekLast()>l2.peekLast()){
                l1.add(el);
            }else{
                l2.add(el);
            }
       } 
       int[] res=new int[nums.length];
       int index=0;
       for(int i:l1){
        res[index++]=i;
       }
       for(int j:l2){
        res[index++]=j;
       }
       return res;
    }
}