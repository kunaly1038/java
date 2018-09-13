import java.util.Scanner;

public class Frequency {
   static Scanner sc = new Scanner(System.in);
   public static void main(String... x){
       String s = sc.nextLine();
       char [] ch = new char[s.length()];
       for(int i =0; i<s.length(); i++){
           ch[i] = s.charAt(i);
       }
       int counter = 0;
       for(int i=0; i<ch.length; i++){
           counter = 0;
           for(int j=0; j<ch.length; j++){
               if(j<i && ch[i]==ch[j]){
                   break;
               }
               if(ch[i]==ch[j]){
                   counter++;
               }
               if(j==ch.length-1){
                   System.out.println(ch[i]+" counter times :"+counter);
               }
           }
           
       }
       
   }
}
