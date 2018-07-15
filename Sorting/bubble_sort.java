import java.util.Scanner;

class bubble{
   
   
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
        bubbleSort(array);
        for(int i=0;i<array.length;i++){
             System.out.print(array[i]);
        }
    }
   public static void bubbleSort(int array[]){
      for(int i=0;i<array.length-1;i++){
          for(int j=0;j<array.length-i-1;j++){
              if(array[j]>array[j+1]){
          int temp=0;
          temp=array[j];
          array[j]=array[j+1];
          array[j+1]=temp;
        }
        }
       
    }
    
    }
}
