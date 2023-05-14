import java.util.Scanner;

public class fibonacci {
     static int fibo(int x){
        if(x<=1){
            return x;
        }
        return fibo(x-1) + fibo(x-2);
     }
 
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter ypour number");
        int n = sr.nextInt();
        for(int i=0; i<n; i++){
            System.out.print(fibo(i)+" ");
        }
    }
 }

