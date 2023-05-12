import java.util.Scanner;

public class multi_array {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("\tMultiplication of two matrix:");
        System.out.println("Enter array size:");
        int size = sr.nextInt();
        int [][] a = new int[size][size];
        System.out.println("\t1st array");
        System.out.println("Enter array elements:");
            for(int i=0; i<size; i++){
                for(int j=0; j<size; j++){
                    a[i][j] = sr.nextInt();
                }
            }
        int [][] b = new int [size][size];
        System.out.println("\t2nd array");
        System.out.println("Enter array elements:");
            for(int i=0; i<size; i++){
                for(int j=0; j<size; j++){
                    b[i][j] = sr.nextInt();
                }
            }
        int [][] multi = new int[size][size];
            for(int i=0; i<size; i++){
                for(int j=0; j<size; j++){
                    multi[i][j]=0;
                   for(int k=0; k<size; k++){
                        multi[i][j] += a[i][k]*b[k][j];
                   }
            }
        }
        System.out.println("Matrix multiplication is:");
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(multi[i][j]);
                System.out.print("\t");
            }
            System.out.println("\n");
        }

    }
}
