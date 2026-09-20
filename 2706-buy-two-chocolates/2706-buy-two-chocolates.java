class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int count=0;
        int c=money;
        for(int i:prices){
            if(i<=money){
                money=money-i;
                count++;
                System.out.print(money);
            }
            if(count==2){
                return money;
            }
        }
        return c;
    }
}