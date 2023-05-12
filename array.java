public class array {
    public static void main(String[] args) {
        // there are three ways to create an array in java
        /*1. int [] marks; (array is declared here)
            marks = new int[size of array]; (memory allocation is done here)
        */
        // 2.
        int [] marks = new int[5];
        // it contains declaration + memory allocation
        marks[0]=20;
        marks[1]=40;
        marks[2]=60;
        marks[3]=80;
        marks[4]=100;
        System.out.println(marks[3]);
        /*3. int [] arrays ={elements of array}
         it contains declaration + initialization
        */
    }
}
