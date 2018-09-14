import java.util.Scanner;

public class Duplicate {
    static Scanner scan = new Scanner(System.in);
    public static void main(String... args){
        System.out.println("Enter the String :");
        String str = scan.nextLine();
        String [] split = str.split(" ");
        int count = 0;
        
        for(int i=0; i<split.length; i++){
            count=0;
            
            for(int j=0; j<split.length; j++){
                
                if(j<i && split[i].equals(split[j])){
                    break;
                }
                
                if(split[i].equals(split[j])){
                    count++;
                }
                
                if( count>1 && j==split.length-1){
                    System.out.println(split[i]+ " frequency "+ count);
                }
            }
        }
       
    }
}
