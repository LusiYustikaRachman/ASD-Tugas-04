package Sorting;
public class No_02 {
     public static void main(String[] args) {
        System.out.println("Bubble Short");
        System.out.println("Lusi Yustika Rachman");
        System.out.println("Data Sebelum diurutkan");
        int[] data = {25,7,9,13,3};
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        int A=1;
        while (A<data.length){
            int j = data.length-1;
            while (j>=1){
                if (data[j-1]>data[j]){
                    int temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
                j = j-1;
            }
            A = A+1;
        }
        System.out.println();
        System.out.println("Data setelah diurutkan");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
}
