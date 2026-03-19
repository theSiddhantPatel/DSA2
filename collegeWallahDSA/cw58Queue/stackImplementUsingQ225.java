import java.util.ArrayDeque;
import java.util.Queue;
//
public class stackImplementUsingQ225 {
    Queue<Integer>q1=new ArrayDeque<>();
    Queue<Integer>q2=new ArrayDeque<>();

    public stackImplementUsingQ225() {

    }

    public void push(int x) {
        q1.add(x);

    }

    public int pop() {
        for (int i = 0; i < q1.size() - 1; i++) {
            q1.add(q1.remove());
        }
        int val=q1.peek();
        q1.remove();
        return val;

    }

    public int top() {
        for (int i = 0; i < q1.size()-1; i++) {
            q1.add(q1.remove());
        }
        int val=q1.peek();
        q1.add(q1.remove());
        return  val;

    }

    public boolean empty() {
return q1.isEmpty();
    }
}
