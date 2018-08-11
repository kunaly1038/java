import java.util.*;
public class Notes {
    public static boolean isPrime(int num)
    {
        if(num == 2 || num == 3)
            return true;
        else if(num % 2 == 0)
            return false;
        
            for(int i=3 ; i<num/2 ; i++)
            {
                if(num%i == 0)
                    return false;  
            }
            return true;
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       if(isPrime(num))
           System.out.println("It is a Prime Number");
       else
           System.out.println("It is not a Prime Number");
       
    }
    
}
