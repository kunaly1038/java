import java.util.*;

public class Power{
    static Scanner sc = new Scanner(System.in);
    public static void main(String... args){
        int x=5, y=3, result, num;
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
