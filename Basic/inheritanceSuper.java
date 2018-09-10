
package study;
import java.util.Scanner;
class studyHard{
    int a, b;
    public void fun(int a, int b){
        System.out.println("This is parent class which does addition.");
        this.a = a;
        this.b = b;
        System.out.println("a + b = "+(a+b));
    }
}
public class Study extends studyHard {
    int a, b;
    @Override
    public void fun(int a, int b){
        super.fun(a,b); //Super keyword is there to call the parent calls funtion
        System.out.println("This is child class which does substraction.");
        this.a = a;
        this.b = b;
        System.out.println("a - b ="+(a-b));
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A :");
        int a = sc.nextInt();
        System.out.println("Enter the value of B :");
        int b = sc.nextInt();
        new Study().fun(a, b); // anonymous object
    }
    
}
