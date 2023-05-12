import java.util.Scanner;

public class add_of2array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = input.nextInt();
        int [][] a = new int[size][size];
        System.out.println("\t1st array:");
        System.out.println("Enter array elements:");
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
            a[i][j] = input.nextInt();
        }
    }
        int [][] b = new int[size][size];
        System.out.println("\t2nd array:");
        System.out.println("Enter array elements:");
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
            b[i][j] = input.nextInt();
        }
    }
        int [][] sum = new int[size][size];

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Addition of two arrays:");
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(sum[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}
