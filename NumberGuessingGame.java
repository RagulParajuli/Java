import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int final_number = random.nextInt(100) + 1;
        // number beetween 1 to 100 is generated randomly in this line
        Scanner input = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("Enter your number:"); 
            int given_number = input.nextInt();
            count++;
            if(given_number == final_number){
                System.out.println("Congratulation, You have guessed correct number");
                break;
            }
            else if(given_number < final_number){
                System.out.println("Too Low, Try Again!");
            }
            else{
                System.out.println("Too High, Try Again!");
            }
            System.out.println("Tried = "+count+" times\n");
         } 
    }
}
