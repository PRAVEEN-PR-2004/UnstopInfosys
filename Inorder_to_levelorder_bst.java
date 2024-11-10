import java.util.*;;

class Node {
    Node left;
    Node right;
    int key;

    Node(int data) {
        left = right = null;
        key = data;
    }
}

class Main {
    public static Node buildTree(int st, int lt, int[] arr) {
        if (st > lt) { // Fixed condition
            return null;
        }
        int mid = st + (lt - st) / 2;
        Node node = new Node(arr[mid]);
        node.left = buildTree(st, mid - 1, arr);
        node.right = buildTree(mid + 1, lt, arr);
        return node;
    }

    public static void Inorder_to_levelorder_bst(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Node root = buildTree(0, arr.length - 1, arr);
        levelOrder(root);
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> st = new LinkedList<>();
        st.add(root);
        while (!st.isEmpty()) {
            Node cur = st.poll();
            System.out.print(cur.key + " ");
            if (cur.left != null) {
                st.add(cur.left);
            }
            if (cur.right != null) {
                st.add(cur.right);
            }
        }
    }
}