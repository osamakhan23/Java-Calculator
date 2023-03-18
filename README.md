# Java Calculator
 Calculator

This is a simple calculator program written in Java. It takes two numbers and an operator (+, -, *, /) as input from the user and performs the corresponding calculation.

Getting Started
To run this program on your local machine, you'll need to have Java installed. You can download the latest version of Java.

1. Clone this repository or download the Calculator.java file.
2. Open a terminal or command prompt and navigate to the directory containing the Calculator.java file.
3. Compile the program by running the command javac Calculator.java.
4. Run the program by running the command java Calculator.

How to Use
1. When you run the program, you will be prompted to enter the first number.
2. Enter the first number and press enter.
3. You will then be prompted to enter the second number.
4. Enter the second number and press enter.
5. You will then be prompted to enter an operator (+, -, *, /).
6. Enter the operator and press enter.
7. The program will then perform the calculation and display the result.

Example
Here's an example of how to use the program:
Enter first number: 5
Enter second number: 3
Enter operator (+, -, *, /): *
5 * 3 = 15.0

#UPDATE#
Operators
The following operators are supported:

1. Addition (+): adds the two numbers together
2. Subtraction (-): subtracts the second number from the first
3. Multiplication (*): multiplies the two numbers together
4. Division (/): divides the first number by the second
5. Modulus (%): returns the remainder of dividing the first number by the second
6. Exponentiation (^): raises the first number to the power of the second
7. Square Root (sqrt): returns the square root of the first number

#UPDATE#
1. Created a new Java class (e.g. CalculatorGUI) that extends the JFrame class and implements the ActionListener interface. This class will contain the code for creating the GUI and handling user input.
2. In the CalculatorGUI class, created a JPanel to hold the calculator buttons, and added the buttons to the panel using the GridLayout manager.
3. Use JTextField to create a text field where the user can enter calculations, and added this to the CalculatorGUI panel.
4. Created a JButton for each calculator button and add it to the CalculatorGUI panel. Use the ActionListener interface to handle button clicks and update the text field accordingly.
5. In the main() method of the Calculator class, created an instance of the CalculatorGUI class and set it to be visible.
6. With these updates, the new calculator program should now have a graphical user interface that allows users to input calculations using buttons and see the results in a text field.

