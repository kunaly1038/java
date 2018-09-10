
package study;
import java.util.Scanner;
abstract class studyHard{
    abstract void fun();
   
}

class studyHard1 extends studyHard{
    @Override 
    void fun(){
        System.out.println("this is studyHard1");
    }
}

class studyHard2 extends studyHard{
    @Override 
    void fun(){
        System.out.println("this is studyHard2");
    }
}

 class Study extends studyHard1{
    @Override
     void fun(){
         System.out.println("This is Main class.");
     }
    
    public static void main(String [] x){
       studyHard sh = new studyHard1();
       sh.fun();
       studyHard sh1 = new Study();
       sh1.fun();
       studyHard s32 = new studyHard2();
       s32.fun();
    }
}
