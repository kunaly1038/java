import java.util.Scanner;

public class Queue {
    
    static void reverseString(String s){
        for(int i=s.length()-1; i>0;i--){
            System.out.print(s.charAt(i));
        }
       
    }
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String... args){
        String s = sc.nextLine();
        reverseString(s);
    }
}
