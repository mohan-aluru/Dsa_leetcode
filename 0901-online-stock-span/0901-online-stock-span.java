class StockSpanner {
    Stack<Integer> s;
    Stack<Integer> ans;
    public StockSpanner(){
    s=new Stack<>();
    ans=new Stack<>();
    }
    public int next(int price) {
        int span=1;
        while(!s.isEmpty() && s.peek()<=price){
            span+=ans.peek();
            s.pop();
            ans.pop();
        }  
        s.push(price);//storing price
        ans.push(span);//storing span 
        return span;
    }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */