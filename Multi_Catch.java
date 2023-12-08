
public class Multi_Catch {
    public static void main(String[] args) {
        int i = 3;
        int j = 0;
        int num[] = new int[5];
        String str = null;
        try{
            j = 8/i;
            System.out.println(str.length());
            System.out.println(num[1]);
            System.out.println(num[5]);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divided by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit");
        }
        catch(Exception e){
            System.out.println("Something went worng");
        }
        System.out.println("Rest of the code");
        
    }
}
