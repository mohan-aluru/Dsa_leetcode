class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int index=n-1;
      
        Stack<Integer> s=new Stack<>();
        for(int i=n*2-1;i>=0;i--){
            int t=nums[i%n];
            while(!s.isEmpty() && s.peek()<=t){
            s.pop();
            }
            if(i<n){
                ans[index--]=s.isEmpty()?-1:s.peek();
            }
            s.push(t);
        }
        return ans;
    }
}