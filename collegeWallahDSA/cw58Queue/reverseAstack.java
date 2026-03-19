import java.util.Stack;

public class reverseAstack {
    public static void revStack(Stack<Integer> st) {
        if (st.isEmpty()) return ;
        int top = st.peek();
        st.pop();
        revStack(st);
        Stack<Integer> temp = null;
        while (!st.isEmpty()) {
            temp.push(st.peek());
            st.pop();
        }
        st.push(top);
        while (!temp.isEmpty()) {
            st.push((temp.peek()));
            temp.pop();
        }


    }

    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        revStack(st);
        System.out.println(st);
    }

}

