import java.util.Scanner;

public class pbsol_mrthod {
    static void multiply(int x){
        for(int i=1; i<=10; i++){
            int z = x*i;
            System.out.println(x+" * "+i+" = "+z);
        }
    }
    static void astric(int x){
        for(int i=1; i<=x; i++){
            for(int j=1; j<=i; j++){
            System.out.print("*\t");
          }
          System.out.print("\n");
        }
    }
    static void natural(int x){
        int sum = 0;
        for(int i=1; i<=x; i++){
           sum = sum + i;
        }
        System.out.println("The sum of first "+x+" natural number is "+sum);
    }
    static void rev_astric(int x){
        for(int i=1; i<=x; i++){
            for(int j=x; j>=i; j--){
            System.out.print("*\t");
          }
          System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
           //qns-01
        System.out.println("Enter your number:");
        int n1 = sr.nextInt();
        multiply(n1);

           //qns-02
        System.out.println("Enter your number:");
        int n2 = sr.nextInt();
        astric(n2);

           // qns-03
        System.out.println("Enter your number:");
        int n3 = sr.nextInt();
        natural(n3);

        // qns-04
        System.out.println("Enter your number:");
        int n4 = sr.nextInt();
        rev_astric(n4);

        // qns-05, 06, 07 and 08 arealready done






     }
}
