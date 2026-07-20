class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans=new int[nums.length-k+1];
        int index=0;
        Deque<Integer> dq=new ArrayDeque<>();
       for(int r=0;r<nums.length;r++){
        while(!dq.isEmpty() && dq.peekFirst()<=r-k){
            dq.pollFirst();
        }
        while(!dq.isEmpty() && nums[dq.peekLast()]<nums[r]){
            dq.pollLast();
        }
        dq.offerLast(r);
        if(r>=k-1){
            ans[index++]=nums[dq.peekFirst()];
        }
       }
      
        return ans;
    }
}