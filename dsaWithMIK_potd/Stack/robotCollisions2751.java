import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class robotCollisions2751 {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        //sort indices based on positions
        Arrays.sort(indices, (i, j) -> Integer.compare(positions[i], positions[j]));
        Stack<Integer> st = new Stack<>();
        for (int curr_idx : indices) {
            if (directions.charAt(curr_idx) == 'R') {
                st.push(curr_idx);
            } else {
                while (!st.isEmpty() && healths[curr_idx] > 0) {
                    int top_idx = st.pop();

                    if (healths[top_idx] > healths[curr_idx]) {
                        healths[top_idx] -= 1;
                        healths[curr_idx] = 0;
                        st.push(top_idx);
                    } else if (healths[top_idx] < healths[curr_idx]) {
                        healths[curr_idx] -= 1;
                        healths[top_idx] = 0;
                    } else {
                        healths[curr_idx] = 0;
                        healths[top_idx] = 0;
                    }
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (healths[i] > 0) {
                res.add(healths[i]);
            }
        }
        return res;
    }
}
