import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class interleaveTheFirstHalf {
    public static void rearrangeQueue(Queue<Integer> q) {
        // code here
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        n /= 2;
        int k = n;
        //q=12345678
        while (n > 0) {
            st.push(q.remove());
            n--;
        }
        //q=5678  st=1234
        while (!st.isEmpty()) {
            q.offer(st.pop());
        }
        //56784321
        while (k > 0) {
            st.push(q.poll());
            k--;
        }
        //q=4321 st=5678

        while (!st.isEmpty()) {
            q.add(st.pop());
            q.add(q.remove());

        }
        //q=84736251
        while (!q.isEmpty()) {
            st.push(q.poll());
        }
        //q=..  st=15263748  reverse the stack
        while (!st.isEmpty()) {
           q.offer(st.pop());
        }

        //we can replace the above 2 while loops with this loop  (No)
        n=q.size();
        while(n-->0){
            q.offer(q.remove());

        }
    }

    static void main() {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i < 9; i++) {
            q.add(i);
        }
//        q.add(2);
//        q.add(4);
//        q.add(3);
//        q.add(1);
        System.out.println(q);
        rearrangeQueue(q);
        System.out.println(q);
    }
}
