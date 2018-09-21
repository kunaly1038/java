//checking wether the number is armstrong or not without multiplcation operator
import java.util.*;

public class armStrong{
    static Scanner sc = new Scanner(System.in);
    
    static int power(int x, int y){
          int  result, num;
        result = num = x;
        for(int i=1; i<y; i++){
            for(int j=1; j<x; j++){
                result += num;
            }
            num = result;
        }
        return num;
    }
    
    public static void main(String... args){
        int num, temp, power, result=0;
        int check,count = 0;
        System.out.println("Enter the number :");
        num = sc.nextInt();
        check = num;
        while(0!=check){
            check = check/10;
            count++;
        }
        int armstrong = num;
        while(0!=num){
            temp = num % 10;
            temp = power(temp, count);
            result = result + temp;
            num = num/10;
        }
        if(armstrong == result)
            System.out.println("Yes it is an armStrong number");
        else 
            System.out.println("No it is not an armStrong number");
    }
    
}   
