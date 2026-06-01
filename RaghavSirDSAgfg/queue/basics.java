package RaghavSirDSAgfg.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//basic operations: add(),remove()or poll(), peek(),size(),

public class basics {

  static void display(Queue<Integer> q) {
    int n = q.size();
    for (int i = 0; i < n; i++) {
      System.out.print(q.peek() + " ");
      q.add(q.remove());
    }
    System.out.println();
  }

  // add an element at any position: eg; q.add(60,3);add 60 at index 3
  // steps: 3 elements remove and add the element then n-3 elements remove and
  // add
  static void addAtIndex(Queue<Integer> q, int idx, int x) {
    int n = q.size();
    for (int i = 0; i < idx; i++) {
      q.add(q.remove());
    }
    q.add(x);
    for (int i = idx; i < n; i++) {
      q.add(q.remove());
    }
  }

  //reverse a queue;
  static void reverseAq(Queue<Integer> q) {
    //we can use a stack
    int n = q.size();
    Stack<Integer> st = new Stack<>();
    while (!q.isEmpty()) {
      st.add(q.remove());
    }
    while (!st.isEmpty()) {
      q.add(st.pop());
    }
  }

  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(10);
    q.add(20);
    q.add(30);
    // System.out.println(q);
    // q.remove();
    // System.out.println(q);
    // q.poll();
    // System.out.println(q);
    display(q);
    addAtIndex(q, 3, 15);
    display(q);
    System.out.println("the reverse of q is");
    reverseAq(q);
    display(q);
  }
}
