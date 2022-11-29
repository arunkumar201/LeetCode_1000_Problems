class MyStack {

   Queue<Integer> q1;
 Queue<Integer> q2;
   MyStack(){
       q1=new LinkedList<Integer>();
       q2=new LinkedList<Integer>();
       }
    public void push(int x) {
           q1.add(x);
        }
     public int pop() {
          while(q1.size()!=1){
           q2.add(q1.poll());
           }
       // Pop the only left element from q1
    int res=q1.poll();
    // swap the names of two queues
    Queue<Integer> temp=q2;
    q2 = q1;
    q1 = temp;
    return res;
   }
 public int top() {
       if (q1.isEmpty())
           return -1;
       while(q1.size()!=1){
           q2.add(q1.poll());
       }
       // Pop the only left element from q1
       int res=q1.poll();
       q2.add(res);
       // swap the names of two queues
       Queue<Integer> temp=q1;
       q1 = q2;
       q2 = temp;
       return res;
    }
    
    public boolean empty() {
       if(q1.size()>0){
           return false;
       }
        return true;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */