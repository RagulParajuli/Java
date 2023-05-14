import java.util.Scanner;

public class multi_method {
    static void multiply(int x){
        for(int i=1; i<=10; i++){
            int z = x * i;
            System.out.println(x+" * "+i+" = "+z);
        }
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sr.nextInt();
        multiply(n);
    }
    
}
