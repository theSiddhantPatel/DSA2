package RaghavSirDSAgfg.queue;

import java.util.Stack;

public class Implement_q_using_Stacks232 {

  class MyQueue {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public MyQueue() {}

    public void push(int x) {
      st.push(x);
    }

    public int pop() {
      while (!st.isEmpty()) {
        helper.push(st.pop());
      }
      int x = helper.pop();
      while (!helper.isEmpty()) {
        st.push(helper.pop());
      }
      return x;
    }

    public int peek() {
      while (!st.isEmpty()) {
        helper.push(st.pop());
      }
      int x = helper.peek();
      while (!helper.isEmpty()) {
        st.push(helper.pop());
      }
      return x;
    }

    public boolean empty() {
      return st.isEmpty();
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
}
