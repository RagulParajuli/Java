import java.util.Scanner;
  
public class taking_inputs {

    public static void main(String[] args) {
        // System.out.println("Taking input from user");
        Scanner s= new Scanner(System.in);  // this line command is used to take input from user
        // adding of two number 
        System.out.println("Taking number 1");
        int a=s.nextInt();
        System.out.println("Taking number 2");
        int b=s.nextInt();
        int sum=a+b;
        System.out.println("The sum these number is "+sum);
        // or sum+ -> your ans is written first, +sum -> your ans is written at last
        System.out.println(sum+"  is sum of these number");
        // addition of float number as a input from user
        System.out.println("Taking number 1");
        float f1=s.nextFloat();
        System.out.println("Taking number 2");
        float f2=s.nextFloat();
        float addition=f1+f2;
        System.out.println("The sum these number is "+addition);
        // taking string as input from user
        System.out.println("My name is ragul and whats your");
        String str=s.next();  // next only print a string not a sentence
        System.out.println(str+" is a nice name");
        // to check wheather given input is type int or not
        System.out.println("ckeck:");
        boolean b1=s.hasNextInt();
        System.out.println(b1);
        // to print a sentence taken from user
        System.out.println("Write a sentence:");
        String st=s.nextLine();   // string line prints whole sentences
        System.out.println(st);
    }
    
}
