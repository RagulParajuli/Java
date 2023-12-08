class MyNewException extends Exception{
    public MyNewException(String str){    // constructor
        super(str); 
    }
}
public class Custom {
    public static void main(String[] args) {
        int i = 13;
        int j = 0;
        try{
            j = 8/i;
            if (j == 0) {
                throw new MyNewException("Message is something");
                // it throws the Exception message which we need the user to see
                // even if the program run without catch block
            }
        }
        catch(MyNewException e){
            j=1;
            System.out.println("A new Exception created by me is : "+e);
        }
        catch(Exception e){
            System.out.println("Something went worng");
        }
        System.out.println("Rest of the code");
    }
}
