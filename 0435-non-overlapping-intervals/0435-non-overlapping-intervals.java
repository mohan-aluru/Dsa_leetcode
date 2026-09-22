class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);//since we are dcomparing last value so start based on last value in the list
        int count=0;
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(end>intervals[i][0]){
                count++;
            }else{
                end=intervals[i][1];
            }
        }
        return count;
    }
}