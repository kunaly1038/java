
import java.util.*;
public class Notes {
    public static int armstrongNumber(int num)
    {
      int temp,sum =0;
      while(num !=0)
      {
          temp = num % 10;
          sum =  sum + temp*temp*temp;
          num = num / 10;
      }
     return sum;
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       if(num == armstrongNumber(num))
           System.out.println("It is an Armstrong Number");
       else
           System.out.println("It is not an Armstrong Number");
    }    
}
