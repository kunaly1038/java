import java.util.*;

public class String{
    static Scanner scan = new Scanner(System.in);
    static void charDuplicate(String str){
        char [] split = str.toCharArray();
       for(int i=0; i<split.length; i++){
           int count=0;
           for(int j=0; j<split.length; j++){
               if(j<i && split[i]==split[j])
                   break;
               if(split[i]==split[j])
                   count++;
               if(count>1 && j==split.length-1)
                   System.out.println(split[i] +" times : "+count);
           }
       }
    }
    public static void main(String... args){
        System.out.println("Enter the String :");
        String str = scan.next();
        charDuplicate(str);
    }
} 
