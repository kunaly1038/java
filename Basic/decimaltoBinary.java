import java.util.*;
public class Notes {
    public static int decimalBinary(int num)
    {
        int temp=0;
        while(num != 0)
        {
            int rem = num % 2;
            temp = temp *10 + rem;
            num = num/2;
        }
        return temp;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to convert into Binary :");
        int num = sc.nextInt();
        System.out.println("The Binary Number of "+ num+" :" +decimalBinary(num));
    }
}
