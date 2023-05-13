public class method_overloading {
        static void foo(){
            System.out.println("Good Morning bro!");

        }
        static void foo(int a){
            System.out.println("I love you "+a);
        }
        static void foo(int a, int b){
            System.out.println("I love you "+a+" times");
            System.out.println("I hate you "+b+" times");
        }


    // static void change2(int [] arr){
    //     arr[0] = 45;
    // }
    // static void change1(int a){
    //     a =50;
    // }
    public static void main(String[] args) {
        // About Static with some examples
    //    // Case 1: changing the interger
    //    int x =45;
    //     change1(x);
    //     System.out.println("The value of x is: "+x);
    //    /*in this program the value of x remains 45 as it is because main static gave the copy of x to
    //    static method(change1) which does not change its original value(main method)*/

    //    // Case 2: changing in array
    //    int [] marks = {50, 55, 68, 77, 94};
    //     change2(marks);
    //     System.out.println("The value of zero index of matrix is "+marks[0]);
    //     // in case of array, its refernce is passed. Same is the case for object passing to the method
    //     // In case 2, marks pass its reference to arr means it pass its address in index 0 is changen but not value of intex a in case 1.

        // Method Overloading
        // Method Overloading cannot be performed by changing the return type of methods
            foo();
            foo(3000);
            foo(3000, 3000);  // Arguments are actual where parameters are not
            // here method name is taken same but using of parameters made it differents 

        


    }
}
