
import java.util.*;
public class Notes {

    public static int fibonacci(int num)
    {
        int fib = 1, fib1 = 1, fib2 = 1;
        if(num == 1 ||  num == 2)
        {
            return 1;
        }
        else 
        {
             for(int i =3 ; i<= num; i++)
             {
                 fib = fib1 + fib2;
                 fib1 = fib2;
                 fib2 = fib;
             }
        }
            
        return fib;   
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       num = fibonacci(num);
       System.out.println(num);
    }
    
}
