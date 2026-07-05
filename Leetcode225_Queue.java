class MyStack {
    Queue <Integer> q;
   
    public MyStack() {
        q=new LinkedList<>();
        
    }
    
    public void push(int x) {
       q.add(x);
    }
    
    public int pop() {
        for(int i=0;i<q.size()-1;i++){
            q.add(q.remove());
        }
        return q.remove();

    }
    
    public int top() {
        for(int i=0;i<q.size()-1;i++){
            q.add(q.remove());
        }
        int peek=q.peek();
        q.add(q.remove());
        return peek;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}
