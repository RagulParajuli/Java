import java.util.Scanner;

public class sum_of_3_numbers{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        // practice set -ex.1
        System.out.println("Sum of three numbers:");
        System.out.println("Enter 1st number:");
        float a=s.nextFloat();
        System.out.println("Enter 2nd number:");
        float b=s.nextFloat();
        System.out.println("Enter 3rd number:");
        float c=s.nextFloat();
        float sum=a+b+c;
        System.out.println("The sum of three number is "+sum);

    }
}