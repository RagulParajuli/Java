import java.util.Scanner;
public class string{
    public static void main(String[] args) {
      /*   String name = "Ragul";
        System.out.printf("1.My name is %s"
        ,
        name);
        // in java, we can print in multi-line like above method
        // but we cannot seperate line from inside of double cotted
        Scanner sr = new Scanner(System.in);
        System.out.println("\n2.Enter your string:");
        String str = sr.nextLine();
        // nextLine helps to print a whole sentence  
        System.out.println(str);
        */
        // string method
          String any = "ragul";
        System.out.println(any.length());
        // it find the length of string
        System.out.println(any.toUpperCase());
        // it copy string to uppercase
        System.out.println(any.toLowerCase());
        // it copy string to lowercase
        String nontrimstring = "     Trim others     ";
        System.out.println(nontrimstring);
        System.out.println(nontrimstring.trim());
        System.out.println(any.substring(2));
        // create new index from mentioned index
        System.out.println(any.substring(1,4));
        // same as above but doesn't include ending index
        System.out.println(any.replace('r','p'));
        // it replaced char p in place of char r in 'any' variable
        System.out.println(any.replace('u','a'));
        // it replaced char a in place of char u in 'any' variable
        // replace keyword can replace all mentioned char in variable like if we want to replace a in any then it replace all a in any.
        System.out.println(any.replace("gul","van"));
        // it replace old string with new string
        System.out.println(any.startsWith("h"));
        // it gives ans in boolean, if statement is correct it print true or false
        // stratsWith function check wheather given string starts with given char or not
        System.out.println(any.endsWith("l"));
        // same as starsWith but it checks anout endsWith
        // we can check not only by char but by string as well in both startsWith and endsWith function
        System.out.println(any.charAt(3));
        // this function print char of given index
        System.out.println(any.indexOf("g"));
        // this function detect and print index of char
        String name = "Parrot";
        System.out.println(name.indexOf("o",1));
        System.out.println(name.lastIndexOf("r"));
        // this function last give index of mention char 
        System.out.println(name.lastIndexOf("r", 4));
        // this function is also same as above but it search given char 
        System.out.println(any.equals("RAGUL"));
        // this function check weather given string is equals to provided string or not and print in boolean form
        // but it also check weather cases are also same or not
        System.out.println(name.equalsIgnoreCase("PARROT"));
        // this function is also same as above but ignore about cases

        /* escape sequence
        inside double cotted 
         \' = '
        \" = "
        \\ = \
        
        
        */ 





    }
}
