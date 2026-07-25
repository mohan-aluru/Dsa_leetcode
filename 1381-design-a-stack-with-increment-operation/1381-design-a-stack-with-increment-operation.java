class CustomStack {
int[] stack;
int maxsize;
int index;
    public CustomStack(int maxSize) {
        this.maxsize=maxSize;
        stack=new int[maxsize];
        index=-1;
    }
    
    public void push(int x) {
        if(index==maxsize-1){
            return;
        }else{
            stack[++index]=x;
        }
    }
    
    public int pop() {
        if(index==-1){
            return -1;
        }
       int val=stack[index];
       index--;
       return val;
    }
    
    public void increment(int k, int val) {
        int limit=Math.min(k,index+1);
        for(int i=0;i<limit;i++){
            stack[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */