package RaghavSirDSAgfg.queue;

public class Q_Implement_using_array {

  static class CircularQ {

    int[] arr;
    int front;
    int rear;
    int size;

    CircularQ(int length) {
      arr = new int[length];
      front = rear = size = 0;
    }

    int peek() {
      if (size == 0) {
        System.out.println("Q is Empty");
        return -1;
      }
      return arr[front];
    }

    void add(int val) {
      if (size == arr.length) {
        System.out.println("Q is Full");
        return;
      }
      arr[rear++] = val;
      if (rear == arr.length) rear = 0;
      size++;
    }

    int remove() {
      if (size == 0) {
        System.out.println("Q is Empty");
        return -1;
      }
      int frontVal = arr[front];
      front++;
      if (front == arr.length) front = 0;
      size--;
      return frontVal;
    }

    void display() {
      //error in this function
      for (int i = 0; i <= size; i++) {
        int idx = (front + i) % arr.length;
        System.out.print(idx + " ");
      }
    }
  }

  public static void main(String[] args) {
    CircularQ q = new CircularQ(5);
    q.add(1);
    q.add(2);
    q.add(3);
    q.remove();
    q.add(4);

    q.display();
    System.out.println("Another display function isn't working ");
    q.display();
    q.add(6);
    System.out.println("I am another display function");
    q.display();
  }
}
