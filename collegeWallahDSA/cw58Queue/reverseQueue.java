import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public  class reverseQueue {
  //basic
   public static  Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
    Stack<Integer>st=new Stack<>();
    int n=q.size();
    for (int i = 0; i <k; i++) {
        st.push(q.remove());
    }
    Stack<Integer>st2=new Stack<>();

    while (!q.isEmpty()){
        st2.push(q.remove());
    }
    Stack<Integer>st3=new Stack<>();
    while (!st2.isEmpty()){
        st3.push(st2.pop());
    }
    while(!st.isEmpty()){
           q.add(st.pop());
       }
    while(!st3.isEmpty()){
        q.add(st3.pop());

    }

    return q;
}

//optimized
public static  Queue<Integer> reverseFirstK2(Queue<Integer> q, int k) {
    // code here
    Stack<Integer>st=new Stack<>();
    int n=q.size();
    for (int i = 0; i <k; i++) {
        st.push(q.remove());
    }

    while(!st.isEmpty()){
        q.add(st.pop());
    }
    for (int i = 0; i < n-k; i++) {
        q.add(q.remove());
    }

    return q;
}
    static void main() {
        Queue<Integer>q=new ArrayDeque<>();
        q.add(1);q.add(2);q.add(3);q.add(4);q.add(5);
        System.out.println(q);
        System.out.println(reverseFirstK2(q,3));
    }
}
