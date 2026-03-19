import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class firstNegativeOfWindow {
    //https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                q.add(i);

        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n - k + 1; i++) {
            if (q.size() > 0 && q.peek() < i) q.remove();
            if (q.size() > 0 && q.peek() <= i - k + 1)
                list.add(arr[q.peek()]);//q.peek()<=i-k+1  for each window size
                // peek element should be lie in this window
            else list.add(0);

        }
        return list;


    }

}
