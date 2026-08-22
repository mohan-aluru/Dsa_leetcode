class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[k];
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int i:map.keySet()){
        pq.offer(i);
        if(pq.size()>k){
            pq.poll();
        }
        }
        int index=0;
        while(!pq.isEmpty()){
            arr[index++]=pq.poll();
        }
        return arr;
    }
}