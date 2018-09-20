//insertion in the binary search tree
import java.util.*;

public class BinarySearchTree{
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
    
    void insert(int data){
        root = insertNode(root, data);
    }

    
    bst insertNode(bst root, int data){
        if(root == null)
            root = new bst(data);
        else if(data < root.data)
            root.left = insertNode(root.left, data);
        else if(data > root.data)
            root.right = insertNode(root.right, data);
        return root;
    }
    
    public static void main(String... args){
        Queue q = new Queue();
        q.insert(1);
        q.insert(2);
        q.insert(3);
    }
}   
