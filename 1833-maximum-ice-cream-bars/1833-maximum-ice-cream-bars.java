class Solution {
    public int maxIceCream(int[] costs, int coins) {
      Arrays.sort(costs);
      int count=0;
      int r=0;
  for(int cost:costs){
    if(coins<cost){
        break;
    }else{
        count++;
        coins-=cost;
    }
  }
    return count;
}
}