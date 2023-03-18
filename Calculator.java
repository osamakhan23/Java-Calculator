import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Declare and initialize variables
      double num1, num2, result;
      char operator;

      // Get input from user
      System.out.print("Enter first number: ");
      num1 = input.nextDouble();

      System.out.print("Enter second number: ");
      num2 = input.nextDouble();

      System.out.print("Enter operator (+, -, *, /): ");
      operator = input.next().charAt(0);

      // Perform calculation based on operator entered
      switch (operator) {
         case '+':
            result = num1 + num2;
            break;
         case '-':
            result = num1 - num2;
            break;
         case '*':
            result = num1 * num2;
            break;
         case '/':
            result = num1 / num2;
            break;
         default:
            System.out.println("Invalid operator entered!");
            return;
      }

      // Display result to user
      System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
   }
}
