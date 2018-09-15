//find out the positions of the digit and print there positions in the string
import java.util.Scanner;

public class Queue {
    static Scanner scan = new Scanner(System.in);
    
    static void countWords(String str){
       int [] arr = new int[str.length()];
       int counter = 0,j = -1,i;
        char [] split = str.toCharArray();
        for(int k=0;k<arr.length; k++)
            arr[k]=-1;
       for(i=0,j=1; i<split.length; i++){
           if(split[i]=='0' || split[i]=='1' || split[i]=='2' || split[i]=='3' ||split[i]=='4' ||split[i]=='5' ||split[i]=='6' ||split[i]=='7' ||split[i]=='8' ||split[i]=='9'){
               ++j;
               arr[j] = i;
           }
       }
       if(j==-1){
           System.out.println("There is no digit in the String.");
       }
       else{
           for(int x : arr){
               if(x == -1)
                   continue;
               else
                   System.out.println("The digits in string are at position : "+x);
           }
       }
       
    }
    
    public static void main(String... args){
        System.out.println("Enter the String :");
        String str = scan.nextLine();
        countWords(str);
    }
   
}
