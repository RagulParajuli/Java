import java.util.Scanner;

public class multiple_table {
    public static void main(String[] args) {
        
        Scanner sr = new Scanner(System.in);
        System.out.println("Multiplication table upto given number");
        System.out.println("Enter your number:");
        int num = sr.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
             int tabl = i * j;
                System.out.print(i+" * "+j+" = "+tabl+"\t");
            }
            System.out.println("\n");
        }
    }
    
}
