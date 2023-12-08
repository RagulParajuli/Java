public class Throw {
    public static void main(String[] args) {
        int i = 13;
        int j = 0;
        try{
            j = 8/i;
            if (j == 0) {
                throw new ArithmeticException("I can't print zero");
                /*  it throws the Exception message which we need the user to see
                 even if the program run without catch block */
        }
    }
        catch(ArithmeticException e){
            j=1;
            System.out.println("cannot divided by zero "+e);
        }
        catch(Exception e){
            System.out.println("Something went worng");
        }
        System.out.println("Rest of the code");
    }
}