//check wether the string contain only digit or not
import java.util.Scanner;

public class String {
    static Scanner scan = new Scanner(System.in);
    
    static void countWords(String str){
       
       int counter = 0;
        char [] split = str.toCharArray();
       for(int i=0; i<split.length; i++){
           if(split[i]=='0' || split[i]=='1' || split[i]=='2' || split[i]=='3' ||split[i]=='4' ||split[i]=='5' ||split[i]=='6' ||split[i]=='7' ||split[i]=='8' ||split[i]=='9'){
               counter++;
           }
       }
       if(counter == split.length){
           System.out.println("String contains only Digit only");
       }
       else{
           System.out.println("String contains both alphabets and digits");
       }
    }
    
    public static void main(String... args){
        System.out.println("Enter the String :");
        String str = scan.nextLine();
        countWords(str);
    }
   
}
