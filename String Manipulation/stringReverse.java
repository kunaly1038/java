import java.util.Scanner;

public class StringReverse {
    
    static String reverseString(String s){
        String reverse = "";
        String [] split = s.split(" ");
        for(int i=split.length-1, j=0; i>0; i--, j++){
            reverse = reverse + " "+ split[i];
        }
        return reverse;
    }
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String... args){
        String s = sc.nextLine();
        System.out.println(reverseString(s));
    }
}
