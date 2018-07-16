import java.util.Scanner;

class mergesort{
   
    static Scanner sc =new Scanner(System.in);
    public static void main(String [] args){
    
    int [] array ;
    System.out.print("Enter the size of the arryay :");
    int x=sc.nextInt();
    array = new int[x];
    populateArray(array);
    merge(array,0,array.length-1);
    printArray(array);
    }
    static void populateArray(int [] array){
        for(int i=0; i<array.length;i++){
            array[i]=sc.nextInt();
        }
    }
    static void printArray(int [] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    static void mergeSort(int [] array, int l , int r){
        if(l < r){
            int m = (l+r)/2;
            mergeSort(array,l,m);
            mergeSort(array,m+1,r);
            merge(array, l ,m, r);
                  
        }
    }
    static void merge(int [] array, int l, int m, int r){
        int n1 = m-l +1;
        int n2 = r-m;
        
        int [] left= new int[n1];
        int [] right= new int[n2];
            
        for(int i=0;i<n1;i++){
            left[i]=array[l+i];
        }
        
        for(int j=0;j<n2;j++){
            right[j]=array[m+1+j];
        }
        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                array[k]=left[i];            
                i++;
              
        }
        else{
                array[k]=right[j];
                j++;
               
                }
              k++;
    }
          while (i < n1)
        {
            array[k] = left[i];
            i++;
            k++;
        }
 
       
        while (j < n2)
        {
            array[k] = right[j];
            j++;
            k++;
        }
    }
}

