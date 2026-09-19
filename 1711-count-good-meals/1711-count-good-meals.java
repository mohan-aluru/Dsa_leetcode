class Solution {
        int mod = 1000000007;
    public int countPairs(int[] deli) {
        Map<Integer,Integer> map=new HashMap<>();
        int res=0;
        for(int i=0;i<deli.length;i++){
            int power=1;
            for(int j=1;j<=22;j++){
                int  c=power-deli[i];
                if(map.containsKey(c)){
                    res+=map.get(c);
                    res%=mod;
                }
                power*=2;
            }
            map.put(deli[i],map.getOrDefault(deli[i],0)+1);
        }
        return (int)res;
    }
}