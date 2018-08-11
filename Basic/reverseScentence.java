import java.util.*;
public class Notes {
    public static String reverseString(String text)
    {
      String [] reverse;
      reverse = text.split(" ");
      String result = "";
      for(int i=reverse.length-1; i>=0 ; i--)
      {
          result = result + reverse[i] + " ";
      }
           return result;  
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String text = sc.nextLine();
       System.out.println(reverseString(text));
    }    
}
