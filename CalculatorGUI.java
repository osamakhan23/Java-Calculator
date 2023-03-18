import javax.swing.JFrame;
public class CalculatorGUI extends JFrame {
    public class CalculatorGUI extends JFrame implements ActionListener {
        private JTextField firstNumberField;
        private JTextField secondNumberField;
        private JLabel operatorLabel;
        private JButton calculateButton;

        public CalculatorGUI() {
             // Create an instance of the CalculatorGUI class
         CalculatorGUI calculatorGUI = new CalculatorGUI();
            // Set up the frame
            setTitle("Calculator");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            // Create a new JPanel to hold the components
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(4, 2));
            
            // Create the text fields and label
            firstNumberField = new JTextField();
            secondNumberField = new JTextField();
            operatorLabel = new JLabel();
            
            // Create the button
            calculateButton = new JButton("Calculate");
            calculateButton.addActionListener(this);
            
            // Add the components to the panel
            panel.add(new JLabel("First number:"));
            panel.add(firstNumberField);
            panel.add(new JLabel("Second number:"));
            panel.add(secondNumberField);
            panel.add(new JLabel("Operator:"));
            panel.add(operatorLabel);
            panel.add(new JLabel(""));
            panel.add(calculateButton);
            
            // Add the panel to the frame
            add(panel);
            
            // Pack and display the frame
            pack();
            setVisible(true);
        }

@Override
public void actionPerformed(ActionEvent e) {
    double firstNumber = Double.parseDouble(firstNumberField.getText());
    double secondNumber = Double.parseDouble(secondNumberField.getText());
    String operator = operatorLabel.getText();
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
    }
}
    }
}

