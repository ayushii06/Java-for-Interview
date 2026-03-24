// My first Java program

/*
App is the file name and also the class name. It is because of the convention, but it is not mandatory.
The main method is defined as public static void main(String[] args). 
The public keyword means that the method can be accessed from outside the class. 

The static keyword means that the method belongs to the class and not to an instance of the class.

The void keyword means that the method does not return any value. 

The main method takes a single parameter, which is an array of strings. This parameter is used to pass command-line arguments to the program.

*/

public class App {

    // The main method is the entry point of the program.
    public static void main(String[] args) throws Exception {

        // In C++, we use cout<< to print. In Java, we use this syntax
        System.out.println("Hello, World!");
    }

    // If private, it can not be accessed

    // private static void main(String[] args) throws Exception {
    //     System.out.println("Hello, World!");
    // }
}
