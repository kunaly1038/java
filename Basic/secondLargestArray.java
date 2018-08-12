import java.util.*;
public class Notes {
    static Scanner sc = new Scanner(System.in);
    public static int  removeDuplicate(int [] arr)
    {
          if (arr.length < 2)
        {
            System.out.print(" Invalid Input ");
            return 0;
        }
      
        Arrays.sort(arr); 
        int largest=0, second=0;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i] > largest)
            {
                second = largest;
                largest = arr[i];
            }
            else if(arr[i] > second && arr[i]!=largest)
                second = arr[i];
        }
        return second;
    } 
    public static int[] fillArray(int [] arr)
    {
        for(int i =0 ; i<arr.length; i++)
        {
            System.out.println("Enter the Element into the Array :");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
       System.out.println("Enter the size of Array");
       int size = sc.nextInt();
       int [] arr = new int[size];
       int []arr2 =fillArray(arr);
       
       System.out.println(removeDuplicate(arr2));
    }    
}
