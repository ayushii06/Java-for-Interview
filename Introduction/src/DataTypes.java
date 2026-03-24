/*

-------------------------------------------------------------------------------
----------------------------- DATA TYPES --------------------------------------
-------------------------------------------------------------------------------

Datatypes defines the type of data stored.

These are broadly classified into two categories :
1. Primitive.
2. Non-primitive/Reference.

Primitive data types are built-in data types, that directly store values in memory(stack).
Hence, at a particular memory location, the value is stored and could be accessed;

They include : 
            1. byte  - 8 bits / 1 byte    - Default value is 0
            2. short - 16 bits / 2 bytes  -  0
            3. long  - 64 bits / 8 bytes  - 0L
            4. int  - 32 bits / 4 bytes   - 0
            5. float - 32 bits / 4 bytes  - 0.0f
            6. double - 64 bits / 8 bytes - 0.0d
            7. char - 16 bits / 2 bytes   - '\u0000' (null character)
            8. boolean - 1 bit / 1 byte   - false
            
Float and Double are used to store decimal values. Float is less precise than double, but it takes less memory.

Non-primitive data types are user-defined data types, that store references to objects in memory.

The actual data is stored in heap. But it is accessed through reference variable which is stored in stack. It is stored in heap because it can grow dynamically and can be accessed by multiple threads.

When we will access the data, it is actually the reference variable that is accessed, which points to the actual data in heap. Hence, it is called reference data type.

This includes : 
            1. String
            2. Arrays
            3. Classes
            4. Interfaces

-------------------------------------------------------------------------------
----------------x DATA TYPES IMPLICIT AND EXPLICIT CONVERSION x----------------
-------------------------------------------------------------------------------

Implicit type conversion (coercion) is automatic by the compiler, promoting smaller types to larger types to prevent data loss. 

Explicit type conversion (casting) is a manual, user-defined operation required to force a specific type or convert large types to smaller ones, which may cause data loss

*/

public class DataTypes {
      // Int
      int age = 25;

      // char 
      char grade = 'A';

      // Error. We must use single quotes for char data type. Double quotes are used for String data type.
      // char grades = "A"; 

      // boolean
      boolean isTrue = false;

      //byte
      byte b = 100; 

      // Error. The value of byte must be between -128 to 127. Hence, 1000 is out of range.
      // byte c = 1000;

      long c = 1L; // We must use L at the end of the value to indicate that it is a long literal.

      // float
      float f = 3.14f; // We must use f at the end of the value to indicate that it is a float literal.

      // double
      double d = 3.14; // By default, decimal literals are double in Java, so we don't need to use d at the end of the value.

      // String 

      // Note that S is capital.
      String name = "Name";

      // Arrays
      
      // 1. 1-D array
            // Initialised 1-D array
            int[] arr1 = {1, 2, 3, 4, 5};

            // Initialised 1-D array with size
            int[] arr2 = new int[5]; // Default values of all elem is 0.

            // Intialised with size and values
            int[] arr3 = new int[]{1, 2, 3, 4, 5};

            // Initialised with 'x' default values for all elements
            int[] arr4 = new int[5];
            {
                  for (int i = 0; i < arr4.length; i++) {
                        arr4[i] = 'x';
                  }
            }
            // In C++, we simple declare, vector<int> arr(5, 'x'); But in Java, we have to use a loop to assign values to the array.

      // 2. 2-D array

            // Initialised 2-D array
            int[][] arr5 = {{1, 2, 3}, {4, 5, 6}};

            // Initialised 2-D array with size
            int[][] arr6 = new int[2][3]; // Default values of all elem is 0.

            // Intialised with size and values
            int[][] arr7 = new int[][]{{1, 2, 3}, {4, 5, 6}};

      // Implicit type conversion (coercion)

      int x = 10;
      long y = x; // int is promoted to long

      // Explicit type conversion (casting)

      long a = 100L;
      int ex = (int) a; // long is cast to int
      
      // Explicit causes data loss because long can store larger values than int. If a is greater than the maximum value of int, it will wrap around and give an incorrect result.

      // Recommended to use explicit type conversion only when necessary and when you are sure that it will not cause data loss.

      // How will the values change if we will assign a long value to an int variable without explicit type conversion?
      
      public static void main(String[] args) {
            int ori = 150;
            System.out.println("Original value: " + ori);

            int ass = (byte)ori;
            System.out.println("Explicitly typed : " + ass);
            // prints -106.

            // How this -106 calculated?
            // The range of byte is -128 to +127. As the value exceeds 127, it rotates back to -128. So, 128 will be -128.
            // 150-127+1 = 23. Now shift 23-1 from -128 --> 22-128 = -106
      }
}
