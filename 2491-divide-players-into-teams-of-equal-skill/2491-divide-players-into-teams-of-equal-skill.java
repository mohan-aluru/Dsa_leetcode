class Solution {
    public long dividePlayers(int[] skill) {
        long sum=0;
        Arrays.sort(skill);
        int l=0;
        int r=skill.length-1;
        int ind=skill[l]+skill[r];
        while(l<r){
           if(skill[l]+skill[r]!=ind){
            return -1;
           }
            sum+=skill[l]*skill[r];
            l++;
            r--;
           // System.out.println(sum);
        }
        return sum;
    }
}