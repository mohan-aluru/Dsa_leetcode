class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> li=new ArrayList<>();
        int i=0;
        for(String word:words){
          for(char c:word.toCharArray()){
            if(x==c){
                li.add(i);
                break;
            }
          }
          i++;
        }
        return li;
    }
}