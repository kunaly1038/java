import java.util.*;

public class String{
    static Scanner scan = new Scanner(System.in);
    static void checkVowelsConsonantsDigitsWhitespace(String str){
       char []  split = str.toCharArray();
       int vowels = 0, consonants = 0, digits = 0, whitespaces = 0;
       for(int i=0; i<split.length ; i++){
           if(split[i]=='a' ||
                   split[i]=='e' ||
                   split[i]=='i' || 
                   split[i]=='o' || 
                   split[i]=='u')
               vowels++;
           else if(split[i]>='a' && split[i]<='z')
               consonants++;
           else if(split[i]>='0' && split[i]<='9')
               digits++;
           else if(split[i]==' ')
               whitespaces++;               
       }
       System.out.println("Vowels :"+vowels );
       System.out.println("consonants :"+consonants );
       System.out.println("Digits :"+digits );
       System.out.println("whitespaces :"+whitespaces );
    }
    public static void main(String... args){
        System.out.println("Enter the String :");
        String str = scan.nextLine();
        checkVowelsConsonantsDigitsWhitespace(str);
    }
} 
