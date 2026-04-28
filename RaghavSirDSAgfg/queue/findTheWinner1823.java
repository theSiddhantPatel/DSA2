package RaghavSirDSAgfg.queue;

import java.util.LinkedList;
import java.util.Queue;

public class findTheWinner1823 {
    public static int fintTheWinner(int n,int k){
        Queue<Integer>q=new LinkedList<>();
        for (int i = 1; i <=n; i++) {
            q.add(i);
        }
        while (q.size()>1) {
            for (int i = 0; i < k-1; i++) {
                q.add(q.remove());
            }
            q.remove();
        }
        return q.peek();
    }
}
