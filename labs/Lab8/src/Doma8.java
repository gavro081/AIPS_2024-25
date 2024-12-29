import java.util.Scanner;

public class Doma8 {
    static int find_depth(BNode<Integer> node, int val, int ctr){
        if (node.info == val) return ctr;
        if (val > node.info) return find_depth(node.right, val, ctr + 1);
        else return find_depth(node.left, val, ctr + 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = "";
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        int n = in.nextInt();
        int q = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n + q; i++) {
            line = in.nextLine();
            String[] parts = line.split(" ");
            if (line.startsWith("i")){
                tree.insert(Integer.parseInt(parts[1]));
            }
            else {
                System.out.println(find_depth(tree.getRoot(), Integer.parseInt(parts[1]), 1));
            }
        }
    }
}