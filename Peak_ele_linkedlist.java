import java.util.*;

class Node {
    Node next;
    int val;

    Node(int data) {
        next = null;
        val = data;
    }
}

public class Peak_ele_linkedlist {
    public static void addNode(Node head, int data) {
        Node newnode = new Node(data);
        Node tem = head;
        while (tem.next != null) {
            tem = tem.next;
        }
        tem.next = newnode;
    }
    // public static void peak()

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = sc.nextInt();
        Node head = new Node(first);

        for (int i = 1; i < n; i++) {
            int toadd = sc.nextInt();
            addNode(head, toadd);

        }
        Node st = head;
        Node mid = head.next;
        Node lt = head.next.next;
        int count = 0;
        while (lt != null) {
            if (st.val < mid.val && lt.val < mid.val) {
                count++;
            }
            st = st.next;
            lt = lt.next;
            mid = mid.next;
        }
        System.out.print(count);

    }

}
