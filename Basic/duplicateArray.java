import java.util.*;
public class Notes {
    static Scanner sc = new Scanner(System.in);
    public static int  removeDuplicate(int [] arr)
    {
        Arrays.sort(arr);    
      int []  temp = new int[arr.length];
      int j=0;
      int size = arr.length;
        for(int i=0; i<size-1 ; i++)
        {
            if(arr[i] !=arr[i+1])
            {
                temp[j++] =arr[i];
            }
        }
        temp[j++] = arr[size-1];
        for(int i=0; i<j ;i++)
        {
            arr[i] = temp[i];
        }
      return j;
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
       int j = removeDuplicate(arr2);
       for(int i =0; i<j; i++)
            System.out.println(arr[i]);
    }    
}
