import java.util.Scanner;

public class void_method {
    static void multiply(int a){
        int i;
        for(i=1; i<=10; i++){
            int mul = a * i;
            System.out.println(a+" * "+i+" = "+mul);
        }
       
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter your number:");
       int  n = sr.nextInt();
       multiply(n);
    }
}
