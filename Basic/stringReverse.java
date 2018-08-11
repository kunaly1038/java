import java.util.*;
public class Notes {
    public static String reverseString(String text)
    {
       char [] reverse = new char [text.length()];
       
       for(int i=text.length()-1,j=0; i>=0; i--,j++)
       {
          reverse[j] = text.charAt(i);
       }
       String reversed = String.valueOf(reverse);
       return reversed;
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String text = sc.next();
       System.out.println(reverseString(text));
    }    
}
