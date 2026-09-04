import java.util.ArrayList;

public class minAndMaxDist2058 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int i = 2;
        ArrayList<Integer> list = new ArrayList<>();
        while (head.next.next != null) {
            ListNode prev = head;
            ListNode curr = head.next;
            ListNode next = head.next.next;

            if (curr.val > prev.val && curr.val > next.val) {
                list.add(i);

            }
            if (curr.val < prev.val && curr.val < next.val) {
                list.add(i);

            }
            i++;
            head = head.next;
        }
        if (list.size() == 0 || list.size() == 1)
            return new int[] { -1, -1 };

        int max = list.get(list.size() - 1) - list.get(0);
        int min = Integer.MAX_VALUE;
        for (i = 1; i < list.size(); i++) {
            min = Math.min(min, list.get(i) - list.get(i - 1));
        }
        return new int[] { min, max };
    }

    public int[] nodesBetweenCriticalPoints2(ListNode head) {
        int first = -1;
        int prev = -1;
        int min = Integer.MAX_VALUE;
        int max = 0;
        int i = 2;

        while (head.next.next != null) {
            ListNode prevNode = head;
            ListNode curr = head.next;
            ListNode next = head.next.next;

            if ((curr.val > prevNode.val && curr.val > next.val) ||
                    (curr.val < prevNode.val && curr.val < next.val)) {

                if (first == -1) {
                    first = i;
                    prev = i;
                } else {
                    min = Math.min(min, i - prev);
                    max = i - first;
                    prev = i;
                }
            }
            i++;
            head = head.next;

        }
        if (first == -1 || first == prev)
            return new int[] { -1, -1 };

        return new int[] { min, max };
    }
}
