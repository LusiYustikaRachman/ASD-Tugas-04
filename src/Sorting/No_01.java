package Sorting;
public class No_01 {
     public static void main(String[] args) {
        int[] A = {25,7,9,13,3};
        System.out.println("Insertion Short");
        System.out.println("Lusi Yustika Rachman");
        System.out.println("Data Sebelum diurutkan");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" "); 
            
        }
        for (int i = 1; i < A.length; i++) {
            int key = A[i]; 
            int j = i-1; 
            while((j>=0)&&(A[j]>key)){
                A[j+1] = A[j];
                j--;
            }
            A[j+1]=key;  
        }
        System.out.println();
        System.out.println("Data setelah diurutkan");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");     
        }
    }
    
}
