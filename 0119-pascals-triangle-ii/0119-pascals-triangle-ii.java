class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<List<Integer>> res=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        li.add(1);
        res.add(li);
        for(int i=1;i<34;i++){
            List<Integer> prev=res.get(i-1);
            List<Integer> current=new ArrayList<>();
            current.add(1);
            for(int j=0;j<i-1;j++){
                current.add(prev.get(j)+prev.get(j+1));
            }
            current.add(1);
            res.add(current);
        }
        List<Integer> fres=res.get(rowIndex);
        return fres;
    }
}