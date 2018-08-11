

import java.util.*;
public class Notes {

    public static int fibonacciRecursion(int num)
    {
        int fib = 1, fib1 = 1, fib2 = 1;
        if(num == 1 ||  num == 2)
        {
            return 1;
        }
        else 
        {
             return fibonacciRecursion(num -1 ) + fibonacciRecursion(num - 2);
        }
            
          
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       System.out.println(fibonacciRecursion(num));
    }
    
}
