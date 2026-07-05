class MyQueue {
   Stack <Integer> stack;
   Stack <Integer> helperSt;
    public MyQueue() {
        stack=new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        if(stack.isEmpty()) return -1;
        helperSt=new Stack<>();
        while(stack.size()>1) helperSt.push(stack.pop());
        int popValue=stack.pop();
        while(!helperSt.isEmpty()) stack.push(helperSt.pop());
        return popValue;
    }
    
    public int peek() {
      helperSt=new Stack<>();
      while(stack.size()>1) helperSt.push(stack.pop());
        int peekValue=stack.peek();
        while(!helperSt.isEmpty()) stack.push(helperSt.pop());
        return peekValue;
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}
