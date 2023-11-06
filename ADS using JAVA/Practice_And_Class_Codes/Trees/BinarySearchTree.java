package Trees;
    class Node{
    Node left;
    int data;
    Node right;

    public Node(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }    
}
 public class BinarySearchTree {  
     Node root;
    public Node insertNode(Node root,int value){
        if(root==null)
            return new Node(value);
        else if(root.data<value)
            root.right=insertNode(root.right, value);
        else
            root.left=insertNode(root.left, value);
        return root;
    }
     
    public Node deleteNode(Node root,int value){
        if(root==null)
            return null;
        else if(root.data<value)
            root.right=deleteNode(root.right,value);
        else if(root.data>value)
            root.left=deleteNode(root.left,value);
        else{
            if(root.left==null && root.right==null)
                return null;
            else if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            else{
                int rightMin=getRightMin(root.right);
                root.data=rightMin;
                root.right=deleteNode(root.right, rightMin);
            } 
        }
        return root;
    }

    public int getRightMin(Node right) {
        Node temp=right;
        while(temp.left!=null){
            temp=temp.left;
        }
        return temp.data;
    }
    
    public void inOrder(Node root){
        if(root==null)
            return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    
    public void preOrder(Node root){
        if(root==null)
            return;
        System.out.println(root.data);
        inOrder(root.left);
        inOrder(root.right);
    }
    
    public void postOrder(Node root){
        if(root==null)
            return;
        inOrder(root.left);
        inOrder(root.right);
        System.out.println(root.data);
    }
    
    
    public boolean Search(Node root, int value){
        if(root==null)
            return false;
        if(root.data==value)
            return true;
        if(root.data<value)
            Search(root.right, value);
        else
            Search(root.left, value);
        return false;
    }
    
    void BFS() {
        int height = height(root);
        for (int i = 1; i <= height; i++) {
            printGivenLevel(root, i);
        }
    }

    void printGivenLevel(Node root, int level) {
        if (root == null) return;
        if (level == 1) {
            System.out.print(root.data + " ");
        } else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }
    
    int height(Node root) {
        if (root == null) return 0;
        else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            if (leftHeight > rightHeight) return (leftHeight + 1);
            else return (rightHeight + 1);
        }
    }    
    
    
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root=bst.insertNode(bst.root, 100);
        bst.root=bst.insertNode(bst.root, 50);
        bst.root=bst.insertNode(bst.root, 10);
        bst.root=bst.insertNode(bst.root, 60);
        bst.root=bst.insertNode(bst.root, 200);
        bst.root=bst.insertNode(bst.root, 250);
        bst.root=bst.insertNode(bst.root, 150);
        bst.root=bst.insertNode(bst.root, 300);
        
        
        System.out.println("Inorder Traversal: ");
        bst.inOrder(bst.root);
        System.out.println("\nPreorder Traversal: ");
        bst.preOrder(bst.root);
        System.out.println("\nPostorder Traversal: ");
        bst.postOrder(bst.root);
        
        System.out.println("Breadth First Search");
        bst.BFS();
        
//        bst.deleteNode(bst.root,100);
//        System.out.println("After Deleting: ");
//        bst.inOrder(bst.root);
        
    }
}
