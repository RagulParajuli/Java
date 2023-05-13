public class varargs {
    static int sum(int ...arr){
        // int ...arr is Available as int [] arr
        int result = 0;
        for(int a : arr){
            result += a;
        }
        return result; 
    }
    public static void main(String[] args) {
        // if you don't pass any argument in method sum, it return result = 0.
        // int you one parameter in method sum then you need to pass atleast one argument
        //  Eg: static int sum(int a, int ...arr){ } 
        System.out.println("The sum of 4 and 5 is "+sum(4, 5));
        System.out.println("The sum of 3, 4 and 5 is "+sum(3, 4, 5));
        System.out.println("The sum of 2, 3, 4 and 5 is "+sum(2, 3, 4, 5));
    }
}
