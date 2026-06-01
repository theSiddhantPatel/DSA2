package RaghavSirDSAgfg.queue;

public class qImplementationUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static class myQ {
        Node head;
        Node tail;
        int size;

        public myQ() {
            head = tail = null;
            size = 0;
        }

        int peek() {
            if (size == 0) {
                System.out.println("Q is Empty");
                return -1;
            }
            return head.data;
        }

        void add(int val) {
            Node temp = new Node(val);
            if (size == 0)
                head = tail = temp;
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = head.data;
            head = head.next;
            size--;
            return front;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        myQ q = new myQ();
        q.add(10);
        q.add(20);
        q.display();
       System.out.println("peek is "+ q.peek());
        q.remove();
        q.display();
        q.remove();
        q.remove();

    }
}
