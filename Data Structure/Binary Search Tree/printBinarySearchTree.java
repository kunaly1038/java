//print funtion for printing the nodes of the binary tree
public class Queue{
    class bst{
        int data;
        bst left, right;
        public bst(int data){
            this.data = data;
            left = right = null;
        }
    }
    
    bst root;
    
    Queue(){
        root = null;
    }
    
    void print(){
        printNode(root);
    }
    
    void printNode(bst root){
        if(root!=null){
            printNode(root.left);
            System.out.println(root.data);
            printNode(root.right);
        }
    }
    
