class MyQueue {
  Queue<Integer> q1;
   Deque<Integer> q;
    public MyQueue() {
   q=new LinkedList<>();
    }
 public void push(int x) {
     q.addFirst(x);
    }
    public int pop() {
        return q.removeLast();
    }
    
    public int peek() {
        return q.getLast();
    }
    
    public boolean empty() {
       if(q.isEmpty()){
           return true;
       }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */