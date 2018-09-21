//replace duplicates from the string
import java.util.*;

public class replaceDuplicates {
    static Scanner sc = new Scanner(System.in);
    
    static void replaceDuplicate(char [] split){
        char [] remove = new char[split.length];
        int count = 0, counter = 0;
        for(int i=0; i<split.length; i++){
            count = 0;
            for(int j=0; j<split.length; j++){
                if(split[j]==split[i] &&  j<i){
                    break;
                }
                if(split[i]==split[j] && count<1){
                    remove[counter++] = split[i];
                    count++;
                }
            }
        }
        for(char x : remove)
            System.out.print(x);
    }
    
    public static void main(String... args){
        System.out.println("Enter the String :");
        String str = sc.next();
        replaceDuplicate(str.toCharArray());
    }
}   
