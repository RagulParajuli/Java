class Employee1{
    int id;
    String name;
    int salary;
            public void printdetails(){
            System.out.println("My name is: "+name);
            System.out.println("My id is: "+id);
            System.out.println("My salary is: "+salary);
        }
}

public class custom_class {
    public static void main(String[] args) {
        System.out.println("\tThis is our custom class");
        Employee1 sr = new Employee1();  // Instantiating a new Employee object
        Employee1 srr = new Employee1();
        // setting attributes or properties for ragul
        sr.id = 12;
        sr.name = "Ragul";
        sr.salary = 34;

        // setting attributes or properties for eren
        srr.id = 17;
        srr.name = "Eren";
        srr.salary = 36;

        System.out.println("\tEmployee 1");
        // printing the attributes
        sr.printdetails();
        System.out.println("\n\tEmployee 2");
        srr.printdetails();
        // System.out.println(sr.id+"\n"+sr.name);
    }
}
