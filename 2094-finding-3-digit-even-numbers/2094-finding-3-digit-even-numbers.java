class Solution {
    public int[] findEvenNumbers(int[] digits) {
        TreeSet<Integer> set=new TreeSet<>();
        int n=digits.length;
        for(int h=0;h<n;h++){
            if(digits[h]==0)continue;
            for(int t=0;t<n;t++){
                if(t==h)continue;//skipping only same element since we can use multiplpe of same value if present as many as in array
                for(int u=0;u<n;u++){
                    if(u==t ||u==h)continue;//dont include same element at any position
                    if(digits[u]%2!=0)continue;
                    int temp=digits[h]*100+digits[t]*10+digits[u];
                    set.add(temp);
                }
            }
        }
        int[] res=new int[set.size()];
        int index=0;
        while(!set.isEmpty()){
            res[index++]=set.pollFirst();
        }
        return res;
    }
}