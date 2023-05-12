import java.util.Scanner;

public class cnd_switch_case {
    public static void main(String[] args) {
        
        Scanner sr = new Scanner(System.in);
        System.out.println(" 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Modules\n 6.Sqare");
        System.out.println("Enter your Choice:");
        int ch = sr.nextInt();
        // char ch = sr.next().charAt(0);
        // to store single char which is obtained from user
        switch(ch){
        case 1:
            System.out.println("Enter two numbers:");
            int a = sr.nextInt();
            int b = sr.nextInt();
            System.out.println(a+b);
            break;
        case 2:
            System.out.println("Enter two numbers:");
            int a1 = sr.nextInt();
            int b1 = sr.nextInt();
            System.out.println(a1-b1);
            break;
        case 3:
            System.out.println("Enter two numbers:");
            int a2 = sr.nextInt();
            int b2 = sr.nextInt();
            System.out.println(a2*b2);
            break;
        case 4:
            System.out.println("Enter two numbers:");
            int a3 = sr.nextInt();
            int b3 = sr.nextInt();
            System.out.println(a3/b3);
            break;
        case 5:
            System.out.println("Enter two numbers:");
            int a4 = sr.nextInt();
            int b4 = sr.nextInt();
            System.out.println(a4%b4);
            break;
        case 6:
            System.out.println("Enter a number:");
            int a5 = sr.nextInt();
            // int b = sr.nextInt();
            System.out.println(a5*a5);
            break;
        default:
            System.out.println("Error 404!");



        }
    }
    
}
