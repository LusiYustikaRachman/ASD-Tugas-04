package Sorting;
public class No_04 {
    public static void main(String[] args) {
        int A[] = {25,7,9,13,3};
        System.out.println("Shell Short");
        System.out.println("Lusi Yustika Rachman");
        System.out.println("Data sebelum diurutkan");
        hasil(A); 
        shellshort(A);
        System.out.println();
        System.out.println("Data setelah diurutkan");
        hasil(A);
    }
    public static void shellshort(int[] A) {
        int n = A.length;
        int C = 0;
        int M = 0;
        int jarak, i, k, kondisi;
        boolean sudah = true;
        int temp;
        jarak = n;
        
        while (jarak >=1){
            jarak = jarak / 2;
            sudah = true;
            while(sudah){
                sudah = false;
                for (k = 0; k < n-jarak; k++) {
                    i = k + jarak;
                    C++;
                    if (A[k]>A[i]){
                        temp = A[k];
                        A[k] = A[i];
                        A[i] = temp;
                        sudah = true;
                    }
                }
            }
        }
    } 
    public static void hasil(int[]data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
    }
}
