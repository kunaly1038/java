import java.util.*;
public class Notes {
    public static int integerPalindrome(int num)
    {
      int temp=0, rem=0;
      while(num!=0)
      {
          rem = num % 10;
          temp = temp *10 + rem;
          num = num / 10;
      }
     return temp;
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       if(num == integerPalindrome(num))  
           System.out.println("Yes it is not an Integer Palindrome");
       else
           System.out.println("No it is not an Integer Palindrome");
       
    }    
}
