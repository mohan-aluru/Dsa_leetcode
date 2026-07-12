class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res=0;
       for(int i=0;i<arr.length;i++){
        if(map.get(arr[i])==arr[i] && res<arr[i]){
            res=arr[i];
        }
       }
        return res==0?-1:res;
    }
}