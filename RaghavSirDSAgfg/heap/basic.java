import java.util.PriorityQueue;

public class basic {

  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(10);
    pq.add(20);
    pq.add(-10);
    pq.add(3);

    System.out.println(pq.peek());
    for (int ele : pq) {
      System.out.print(ele + " ");
    }
  }
}
