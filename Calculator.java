import java.util.Scanner;

public class Calculator {
      public static void main(String[] args) {
        
     
         // Set up console input scanner
         Scanner scanner = new Scanner(System.in);
     
         // Prompt user for input
         System.out.print("Enter first number: ");
         double firstNumber = scanner.nextDouble();
     
         System.out.print("Enter second number: ");
         double secondNumber = scanner.nextDouble();
     
         System.out.print("Enter operator (+, -, *, /, %, ^, sqrt): ");
         String operator = scanner.next();
     
         // Perform calculation
         double result = 0.0;
         switch (operator) {
             case "+":
                 result = firstNumber + secondNumber;
                 break;
             case "-":
                 result = firstNumber - secondNumber;
                 break;
             case "*":
                 result = firstNumber * secondNumber;
                 break;
             case "/":
                 result = firstNumber / secondNumber;
                 break;
             case "%":
                 result = firstNumber % secondNumber;
                 break;
             case "^":
                 result = Math.pow(firstNumber, secondNumber);
                 break;
             case "sqrt":
                 result = Math.sqrt(firstNumber);
                 break;
             default:
                 System.out.println("Invalid operator.");
                 System.exit(0);
         }
     
         // Display result
         System.out.println("Result: " + result);
     }
     
}
