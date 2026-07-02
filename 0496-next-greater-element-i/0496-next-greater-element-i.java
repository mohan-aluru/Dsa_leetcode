class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
       int[] temp =new int[nums2.length];
       Stack<Integer> st=new Stack<>();
       temp[n-1]=-1;
       st.push(nums2[n-1]);
       for(int i=n-2;i>=0;i--)
       {
            while(  !st.isEmpty() && st.peek()<=nums2[i])
            {
                st.pop();
            }
           if(st.isEmpty())
           {
            temp[i]=-1;
           }else
           {
            temp[i]=st.peek();
           }
         
           st.push(nums2[i]);
       }
      int[] arr=new int[nums1.length];
      int idx=0;
      for(int i=0;i<nums1.length;i++)
      {
       for(int j=0;j<nums2.length;j++)
       {
        if(nums1[i]==nums2[j])
        {
            arr[idx++]=temp[j];
            break;
        }
       }
      }
      return arr;
    }
}
