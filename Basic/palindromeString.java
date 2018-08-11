import java.util.*;
public class Notes {
    public static String stringPalindrome(String text)
    {
      text = text.toLowerCase();
      char [] reverse =  new char[text.length()];
      String palindrome;
      for(int i =text.length()-1 , j=0 ; i>=0;i--,j++)
      {
          reverse[j] = text.charAt(i);
      }
           palindrome = String.copyValueOf(reverse);
           return palindrome;
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String text = sc.next();
       String text2 = stringPalindrome(text);
       if(text2.equals(text.toLowerCase()))
           System.out.print("Yes it is an Palindrome String");
       else
           System.out.println("No is is not an Palindrome String");
    }    
}
