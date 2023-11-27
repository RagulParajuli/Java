package Inheritance;

import java.util.Scanner;

class rectangle{
    int l, b;
    void userInput(){
        try(Scanner input = new Scanner(System.in)) {
            System.out.println("Enter Lengths and Breaths");
             l = input.nextInt();
             b = input.nextInt();
        }
    }
}

class shape extends rectangle{
        void area(){
            int Area = l * b;
            System.out.println("Area of a rectangle is :"+Area);
        }
}

public class inherit {
    public static void main(String[] args) {
        shape s = new shape();
            s.userInput();
            s.area();
    }
}
