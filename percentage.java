import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
            //   Exercise 1.1

        System.out.println("\t\tPercentage of a Student in 5 subjects");;
        System.out.println("Enter mark of 1st subject:");
        float m=s.nextFloat();
        System.out.println("Enter mark of 2st subject:");
        float e=s.nextFloat();
        System.out.println("Enter mark of 3rd subject:");
        float p=s.nextFloat();
        System.out.println("Enter mark of 4th subject:");
        float ch=s.nextFloat();
        System.out.println("Enter mark of 5th subject:");
        float cm=s.nextFloat(); 
        float tot= m+e+p+ch+cm;
        float per=(tot/500)*100;
        System.out.println("The percentage is: "+per);
    
    
    
    
    
    
    
    
    }
}
