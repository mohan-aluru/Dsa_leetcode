class Solution {
    public int minDays(int[] nums, int m, int k) {//nums arre the days that flower can bloom so low and high are the min and max days
       int n=nums.length;
       if((long)m*k>n)return -1; //more flowers are needed so not possible
       int low=Integer.MAX_VALUE;
       int high=Integer.MIN_VALUE;
       for(int i:nums){
        low=Math.min(low,i);
        high=Math.max(high,i);
       }
       int ans=-1;
       while(low<=high){
        int mid=low+(high-low)/2;
        if(find(nums,m,k,mid)){
            ans=mid;
            high=mid-1;
        }else{
            low=mid+1;
        }
       }
       return ans;
    }
    static boolean find(int[] nums,int m,int k,int mid){
        int b=0;
        int count=0;
        for(int i:nums){
            if(i<=mid){
                count++;
                if(count==k){
                    b++;
                    count=0;
                }
            }else{
                count=0;//adjacents flowers should be picked
            }
        }
        return b>=m;
    }
}