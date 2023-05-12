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


    /*
     if our sub method doesn't include static the we need to create new object so that we can access main method which is static
     Eg: <class name> obj = new <class name>;
        int var = obj.(sub method);
     */
}
