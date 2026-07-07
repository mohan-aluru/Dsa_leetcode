class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maxarea=0;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<=n;i++){
            int h=(i==n)?0:heights[i];
            while(!s.isEmpty() && h<heights[s.peek()]){
                int height=heights[s.pop()];
                int width=(s.isEmpty())?i:i-s.peek()-1;
                int area=height*width;
                maxarea=Math.max(maxarea,area);
            }
            s.push(i);
        }
        return maxarea;
    }
}