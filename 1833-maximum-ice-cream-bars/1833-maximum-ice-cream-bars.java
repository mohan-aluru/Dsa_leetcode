class Solution {
    public int maxIceCream(int[] costs, int coins) {
      Arrays.sort(costs);
      int low=0;
      int high=costs.length;
     
      while(low<=high){
        int mid=low+(high-low)/2;
        if(find(costs,coins,mid)){
           low=mid+1;
        }else{
            high=mid-1;
        }
      }
      return high;
    }
private static boolean find(int[] costs,int coins,int max){
    long sum=0;
    for(int i=0;i<max;i++){
        sum+=costs[i];
      
    }
    return sum<=coins;
}
}