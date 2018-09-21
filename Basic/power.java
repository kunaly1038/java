import java.util.*;

public class Power{
    static Scanner sc = new Scanner(System.in);
    public static void main(String... args){
        int x, y, result, num;
        System.out.println("Enter the number :");
        x = sc.nextInt();
        System.out.println("Enter the power :");
        y = sc.nextInt();
        result = num = x;
        for(int i=1; i<y; i++){
            for(int j=1; j<x; j++){
                result += num;
            }
            num = result;
        }
        System.out.println(num);
    }
    
}   
