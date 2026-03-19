import java.util.Stack;

public class QimplementUnsingStack232 {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();//use as a helper stack

    public QimplementUnsingStack232() {

    }


    public void push(int x) {
        st1.push((x));

    }

    public int pop() {
        while (!st1.isEmpty()) {
            st2.push(st1.pop());

        }
        int val = st2.pop();
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
        return val;
    }

    public int peek() {
        while (!st1.isEmpty()) {

            st2.push(st1.pop());
        }
        int val = st2.peek();
        while (!st2.isEmpty()) {
            st1.push((st2.pop()));
        }
        return val;

    }

    public boolean empty() {
        return st1.isEmpty();
    }

    static void main() {
        QimplementUnsingStack232 x = new QimplementUnsingStack232();
        x.push(1);
        x.push(2);
        x.push(3);
        System.out.println(x.pop());
        System.out.println(x.pop());
        System.out.println(x.st1.isEmpty());

    }
}
