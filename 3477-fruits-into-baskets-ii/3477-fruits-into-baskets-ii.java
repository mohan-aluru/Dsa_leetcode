class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] arr=new boolean[fruits.length];
        int count=0;
    for(int i=0;i<fruits.length;i++)
   {
    boolean flag=false;
    for(int j=0;j<baskets.length;j++){
        if(fruits[i]<=baskets[j] && arr[j]==false){
          arr[j]=true;
          flag=true;
          break;//necessary beacuse already placed if skip it occupies other baskets as well
        }
    }
    if(flag==false){
        count++;
    }
    }
    
    
return count;
}
}