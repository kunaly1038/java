import java.util.Scanner;

public class wordCount {
    static Scanner scan = new Scanner(System.in);
    
    static void countWords(String str){
        char [] split = new char[str.length()];
        int count = 0;
        for(int i=0; i<split.length; i++){
            split[i]= str.charAt(i);
            if(split[i] == ' '){
                count++;
            }
            
        }
        System.out.println("Number of words :"+ ++count);
        System.out.println("Number of spaces :"+ --count);
    }
    
    public static void main(String... args){
        System.out.println("Enter the String :");
        String str = scan.nextLine();
        
        countWords(str);
    }
   
}
