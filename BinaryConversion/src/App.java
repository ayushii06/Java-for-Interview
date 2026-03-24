/*
--------------------------------------------------------------------------
------------------------ BINARY CONVERSION -------------------------------
--------------------------------------------------------------------------

Just as we do conversion in C++, the concept is going to be same.

1. Conversion of decimal to binary
    Step 1: We will divide the number by 2 and will store the remainder.
    Step 2: Now divide the quotient obtained above by 2 and store the remainder.
    Step 3: We will repeat the above step until the quotient becomes 0.
    Step 4: At last, reverse the order of remainder.

2. Conversion of binary to decimal
    Step 1: Iterate each bit of binary from right to left and multiply it with 2 raised to the power of its position (starting from 0).
    Step 2: Sum all the values obtained in step 1 to get the decimal equivalent.

In case of we have floating point numbers, we will convert the integer part and the fractional part separately and then will combine them.


1. Converting fractional part of decimal to binary

    Step 1: Multiply the fractional part by 2 and will store the integer part.
    Step 2: Now multiply the fractional part obtained above by 2 and store the integer part.
    Step 3: Repeat until the fractional part becomes 0 or we have obtained the required precision.
    Step 4: At last, we will combine the integer parts obtained in step 1 and step 2 to get the binary equivalent of the fractional part.

2. Converting fractional part of binary to decimal

    Step 1: Iterate each bit of binary from left to right and multiply it with 2 raised to the power of negative of its position (starting from 1).
    Step 2: Sum all the values obtained in step 1 to get the decimal equivalent of the fractional part.

*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter decimal number ");
       double decimal = sc.nextDouble();

       // Converting to binary

       int intPart = (int)decimal;
       double fracPart = decimal-intPart;
       int[] rem = new int[32]; // 32 is enough for binary
       int i = 0;
       while (intPart>0) {
        rem[i] = intPart%2;
        intPart=intPart/2;
        i++;
       }

       int[] fracRem = new int[5];

       int prec = 0;

       while(fracPart!=0 && prec<5){
        fracPart=fracPart*2;
        fracRem[prec] = (int)fracPart;
        prec++;
        fracPart-=(int)fracPart;
       }

       System.out.println("Binary form will be : ");

       for(int j = i-1;j>=0;j--){
        System.out.print(rem[j]);
       }
       System.err.print(".");
       for(int j = 0;j<5;j++){
        System.out.print(fracRem[j]);
       }
    }
}
