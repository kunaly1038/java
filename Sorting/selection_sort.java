import java.util.Scanner;

class selection{
   
   
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
        selectionSort(array);
        for(int i=0;i<array.length;i++){
             System.out.print(array[i]);
        }
    }
   public static void selectionSort(int array[]){
   for(int i=0;i<array.length;i++){
       int min=i;
       for(int j=i+1;j<array.length;j++){
           if(array[min]>array[j]){
               min=j;
           }
           int temp;
           temp=array[min];
           array[min]=array[i];
           array[i]=temp;
       }
   }
    
    }
}
