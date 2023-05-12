import java.util.Scanner;

public class fact_method {

    // factorial
    static int fact(int n){
        int z;
        if(n==1){
            z = n;
        }
        else{
            z = (n*fact(n-1));
        }
        return z;
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter your numbers:");
        int a = sr.nextInt();
        // int b = sr.nextInt();
        int fact = fact(a);
        System.out.println("The factorial is "+fact);
    }

    
}
