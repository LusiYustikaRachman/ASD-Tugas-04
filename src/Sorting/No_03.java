package Sorting;
public class No_03 {
    public static void selectionshort(int[] A){
        int smallindex;
        int pass;
        int j;
        int temp;
        for ( pass = 0; pass < A.length -1; pass++) {
            smallindex = pass;
            for (j = pass + 1; j < A.length; j++) {
                if(A[j]<A[smallindex]){
                    smallindex = j;
                }   
            }
            temp = A[pass];
            A[pass] = A[smallindex];
            A[smallindex] = temp;
        }
        }
    public static void hasil(int[]data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int A[] = {25,7,9,13,3};
        System.out.println("Selection Short");
        System.out.println("Lusi Yustika Rachman");
        System.out.println("Data sebelum diurutkan : ");
        No_03.hasil(A);
        No_03.selectionshort(A); 
        System.out.println("Data setelah diurutkan : ");
        No_03.hasil(A);
    }
}
