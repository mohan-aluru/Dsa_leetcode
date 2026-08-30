class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=-100;
        for(int i:nums){
            if(i>max)max=i;
            if(i<min)min=i;
        }
     int mini=Math.min(front(nums,max,min),back(nums,max,min));
     return Math.min(mini,both(nums,max,min));
    }
    private int both(int nums[],int max,int min){
        int count=0;
  for(int i=0;i<nums.length;i++){
         if(nums[i]==min || nums[i]==max)
        { count++;
          break;}
          count++;
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==min || nums[i]==max){
                count++;
                break;
            }
            count++;
        }
        return count;
    }
    private int front(int[] nums,int max,int min){
        int count=0;
        int indi=0;
        for(int i:nums){
      if(i==min || i==max){
        indi++;
        if(indi==2){
           count++;
            break;
        }
      }
      count++;
        }
        return count;
    }
    private int back(int nums[],int max,int min){
 int count=0;
int indi=0;
  for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==min || nums[i]==max){
                indi++;
                if(indi==2){
                    count++;
                    break;
                }
            }
            count++;
        }
        return count;
}
}