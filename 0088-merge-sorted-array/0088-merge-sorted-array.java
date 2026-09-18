class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=0;
        int r=0;
        int[] arr=new int[m+n];
        int index=0;
        while(l<m && r<n){
               if(nums1[l]<nums2[r]){
                arr[index++]=nums1[l++];
               }else{
                arr[index++]=nums2[r++];
               }
        }
        while(l<m){
            arr[index++]=nums1[l++];
        }
        while(r<n){
            arr[index++]=nums2[r++];
        }
        int i=0;
        for(int x:arr){
            nums1[i++]=x;
        }
    }
}