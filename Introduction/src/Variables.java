/*
I already know, variables are used to store data.
Basically it's a name given to a memory.

Rules for naming variables :
1. Can not be reserved keywords.
2. Start with letter, $ or _
3. It is a case sensitive lang. ( age and Age are different variables)
4. No whitespace allowed.

*/

public class Variables {

      // No error. Because age and AGE are diff var.
      int age = 25;
      int AGE = 30;

      int $age = 35; // Start with $ is allowed.
      int _age = 40; // Start with _ is allowed.

      // Error
      //int 1Hello = 45;


}
