import java.util.Scanner;

public class Anagram {
    static Scanner scan = new Scanner(System.in);
    
    static void sortArray(char [] split1, char [] split2){
        for(int i =0; i<split1.length; i++){
            char key = split1[i];
            int j = i-1;
            while(j>=0 && key<split1[j]){
                split1[j+1] = split1[j];
                j--;
            }
            split1[j+1] = key;
        }
        for(int i =0; i<split2.length; i++){
            char key = split2[i];
            int j = i-1;
            while(j>=0 && key<split2[j]){
                split2[j+1] = split2[j];
                j--;
            }
            split2[j+1] = key;
        }
    }
    static boolean checkAnagram(char [] split1, char [] split2){
        boolean flag = true;  
        if(split1.length != split2.length){
            System.out.println("Not Anagram.");
        }
        else{
            for(int i=0; i<split1.length; i++){
                if(split1[i]!=split2[i]){
                    flag = false;
                    break;
                }
                else
                    flag = true;
            }
        }
        return flag;
    }
    
    public static void main(String... args){
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        char [] split1 = str1.toCharArray();
        char [] split2 = str2.toCharArray();
        sortArray(split1, split2);
        System.out.println( checkAnagram(split1, split2));
    }
}
