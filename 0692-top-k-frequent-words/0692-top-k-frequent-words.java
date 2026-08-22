class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)->
          {  if(map.get(a)!=map.get(b)){
                return map.get(b)-map.get(a);}
            return a.compareTo(b);
                
            }  );
        for(String keys:map.keySet()){
            pq.offer(keys);
            
        }
        List<String> res=new ArrayList<>();
        while(k-->0){
            res.add(pq.poll());
        }
        return res;
    }
}