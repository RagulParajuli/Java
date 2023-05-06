import java.util.Scanner;

public class km_to_miles {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        // practice set-ex.4
         System.out.println("Convert kilometer to miles:");
        System.out.println("Enter your number in kilometer:");
        double km=s.nextDouble();
        double m=(km*0.621371);
        System.out.println(km+" kilometer is "+m+" miles");
        }
}
