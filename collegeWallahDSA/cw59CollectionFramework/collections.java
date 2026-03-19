import java.util.*;

/*collection has 3 types
 *List ,queue and set
 *
 *List
 *list has 3 types
 *1.ArrayList 2. LinkedList 3.Stack
 *
 * Queue
 *
 * Set
 */
public class collections {
    static void main() {

        ArrayList<String> list = new ArrayList<>();
        list.add("siddhant");
        list.add("Patel");
        list.add("Okay");
//        System.out.println(al);

        LinkedList<Character> list2 = new LinkedList<>();
        list2.add('s');
        list2.add('i');
        list2.add('d');
//        System.out.println(list2);

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
//        System.out.println(st.peek());
//        System.out.println(st.pop());
//        st.add(3);
//        System.out.println(st.isEmpty());
//        System.out.println(st);


        //queue
        Queue<String> q = new ArrayDeque<>();
        q.offer("siddhant");
        q.offer("patel");
//        System.out.println(q.element());//returns head element of queue
//        System.out.println(q);
//        q.poll();
//
//        System.out.println(q);
//        System.out.println(q.remove());
//        System.out.println(q.poll());//poll is better than remove function , because it gives "null"as an answer
        // when we print empty queue


        //priority Queue
        //min priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();//min priority queue

       /*
       *PriorityQueue in Java is implemented as a binary heap, not a sorted array/list.
       *  The heap property only guarantees that:

        The root is the minimum element (for min-heap)

        Each parent ≤ its children

        But the array representation isn't fully sorted! For example,
        * your heap might look like this:
      1
     / \
   22   3
   /
  33
       Array representation: [1, 22, 3, 33] */
        pq.add(3);
        pq.add(22);
        pq.add(1);
        pq.add(33);
//        System.out.println(pq);


        //set
        HashSet<Integer> set = new HashSet<>();
        //set doesn't allow duplicate elements
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
       // set.add(2);

        System.out.println(set);
        set.remove(2);
        System.out.println(set);
        System.out.println(set.contains(2));

        System.out.println(set);
    }
}
