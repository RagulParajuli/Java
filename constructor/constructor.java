package constructor;

import java.util.Scanner;

class MyEmployee{
    private int id;
    private String name;
  
    public MyEmployee(){
        int id = 36;
        String name = "Ragul";
    }
    public MyEmployee(int myid, String myname){
        id =myid;
        name = myname;
    }

    public void setname(String n){ name  = n;}
    public String getname(){ return name;}
 public void setid(int i){id = i;}
    public int getid(){return id;}
}
public class constructor {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        MyEmployee e1 = new MyEmployee(); // Method overloading
        // MyEmployee e1= new MyEmployee(63, "ket");
        System.out.println(e1.getid());
        System.out.println(e1.getname());


    }
}
