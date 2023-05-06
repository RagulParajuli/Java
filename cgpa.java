import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        // practice set-ex.2
        System.out.println("Enter mark of 1st subject:");
        float sub1=s.nextFloat();
        System.out.println("Enter mark of 2nd subject:");
        float sub2=s.nextFloat();
        System.out.println("Enter mark of 3rd subject:");
        float sub3=s.nextFloat();
        float cgpa=(sub1+sub2+sub3)/30;
        System.out.println("The cgpa of a student is "+cgpa);

    }
}
