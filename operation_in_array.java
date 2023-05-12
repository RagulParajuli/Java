import java.util.Scanner;

import javax.swing.text.html.parser.Element;

public class operation_in_array {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        // int [] marks = {20, 40, 60, 80, 55};
        // System.out.println(marks[5]);
        // System.out.println(marks.length);
        // to find length of an array

        // to print the element of array in reverse order
        // int [] marks = {20, 40, 60, 80, 55};
        // for(int i=(marks.length-1); i>=0; i--){
        //     System.out.println(marks[i]);
        // }
        // // accessing elememts of array in another way
        // System.out.println("Array elements:");
        // for(int element : marks){
        //     System.out.println(element);
        // }

        // user defined array
        System.out.println("Enter array size:");
        int size = sr.nextInt();
        int [] marks = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0; i<size; i++){
           marks[i] = sr.nextInt();
        }
        System.out.println("Elements in reverse order:");
        for(int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }

    }
}
