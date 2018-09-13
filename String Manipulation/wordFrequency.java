import java.util.Scanner;

public class WordFrequency {
    static Scanner sc = new Scanner(System.in);
    
    static void wordFrequency(String s){
        String [] split = s.split(" ");
        int counter = 0;
        for(int i =0 ; i<split.length; i++){
            counter =0 ;
            for(int j=0; j<split.length; j++){
                if(j<i && split[i].equals(split[j])){
                    break;
                }
                if(split[i].equals(split[j])){
                    counter++;
                }
                if(j == split.length-1){
                    System.out.println(split[i]  +" word count :"+counter);
                }
                
            }
        }
    }
    
    public static void main(String... args){
        String s = sc.nextLine();
        wordFrequency(s);
    }
}
