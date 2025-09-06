
class NodeTree{
    int data;
    NodeTree left;
    NodeTree right;

    public NodeTree(int data){
        this.data=data;
    }
}

public class BinaryTree {

    NodeTree root;
    public void insert(int data) {
        root=inserRec(root,data);



    }

    public NodeTree inserRec(NodeTree root, int data) {

        if(root==null)
            root=new NodeTree(data);

        else if (data < root.data) {
            root.left=inserRec(root.left, data);
        }

        else if(data > root.data){
            root.right=inserRec(root.right, data);
        }

        return root;
    }

    public void inorderPrint(){
            inorderRec(root);
    }
    public void inorderRec(NodeTree root){

        if(root!=null){
            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorderRec(root.right);
        }

    }
}
