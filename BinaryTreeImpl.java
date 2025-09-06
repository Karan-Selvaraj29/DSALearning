
//implementing binary search tree(bst)
//printing in inorder method

public class BinaryTreeImpl {

    public static void main(String[] args){
        BinaryTree bst=new BinaryTree();

        bst.insert(7);
        bst.insert(5);
        bst.insert(4);
        bst.insert(6);

        bst.insert(14);
        bst.insert(11);
        bst.insert(10);

        System.out.println("Printing Binary Search tree");
        bst.inorderPrint();
    }
}
