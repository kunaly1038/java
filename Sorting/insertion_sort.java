
import java.util.Scanner;

class insertion{
   
   
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        int []array ;
        int x,y;
        System.out.println("Enter the size of the array :");
        x=sc.nextInt();
        array=new int[x];
        for(int i=0; i<x;i++){
           
            array[i]=sc.nextInt();
        }
        insertionSort(array);
        for(int i=0;i<array.length;i++){
             System.out.print(array[i]);
        }
    }
   public static void insertionSort(int array[]){
       for(int i=0;i<array.length;i++){
           int key = array[i];
           int j=i-1;
           while(j>=0 && key<array[j]){
                array[j+1]=array[j];
                j--;
           }
           array[j+1]=key;
       }
       
   }
    
}
