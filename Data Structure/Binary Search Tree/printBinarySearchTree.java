//print funtion for printing the nodes of the binary tree
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
        q.print();
    }
}   

