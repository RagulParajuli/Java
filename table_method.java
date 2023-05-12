import java.util.Scanner;

public class table_method {
    static int table(int x){
        int m;
        for(int i=1; i<=10; i++){
            m = x*i;
            System.out.println(x+" * "+i+" = "+m);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sr.nextInt();
        int table = table(n);

    }
}
