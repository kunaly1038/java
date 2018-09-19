import java.util.*;

public class String{
    static Scanner scan = new Scanner(System.in);
    static void checkVowels(String str){
       char []  split = str.toCharArray();
       int count = 0;
       for(int i=0; i<split.length ; i++){
           if(split[i]=='a' || split[i]=='e' || split[i]=='i' || split[i]=='o' || split[i]=='u')
               count++;
       }
       System.out.println("counter :" +count);
    }
    public static void main(String... args){
        System.out.println("Enter the String :");
        String str = scan.nextLine();
        checkVowels(str);
    }
} 
