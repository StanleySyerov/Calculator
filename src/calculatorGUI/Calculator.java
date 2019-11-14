/* Version 0.0.1
 *  -Fixed some buttons. 
 *
 *
*/


package calculatorGUI;




import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;




public class Calculator extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JButton btnPlus;
    
    double firstNumber;
    double secondNumber;
    String operation;
    String result;
   
   

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculator frame = new Calculator();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Calculator() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 291, 430);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setBounds(10, 11, 246, 32);
        contentPane.add(textField);
        textField.setColumns(10);
        
      //~~~~~~~~~~~~~~ Row 1 ~~~~~~~~~~~~~~~~~~~~~~~~~
        JButton btnBckSpace = new JButton("<-");
        btnBckSpace.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnBckSpace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(textField.getText().length() > 0) {
                    StringBuilder str = new StringBuilder(textField.getText());
                    str.deleteCharAt(str.length() - 1);
                    textField.setText(str.toString());
                }
                
                
            }
        });
        btnBckSpace.setBounds(10, 54, 60, 60);
        contentPane.add(btnBckSpace);
        
        JButton btnClear = new JButton("C");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                firstNumber = 0;
                secondNumber = 0;
                result = "";
            }
        });
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnClear.setBounds(72, 54, 60, 60);
        contentPane.add(btnClear);
        
        JButton btnPercent  = new JButton("%");
        btnPercent.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnPercent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                firstNumber = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "%";
            }
        });
        btnPercent.setBounds(134, 54, 60, 60);
        contentPane.add(btnPercent);
        
        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "+";
            }
        });
        btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnPlus.setBounds(196, 54, 60, 60);
        contentPane.add(btnPlus);
        
        
        //~~~~~~~~~~~~~~ Row 2 ~~~~~~~~~~~~~~~~~~~~~~~~~
        JButton btn7 = new JButton("7");
        btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Enter number 7
                String enterNumber = textField.getText() + btn7.getText();
                textField.setText(enterNumber);
            }
        });
        btn7.setBounds(10, 116, 60, 60);
        contentPane.add(btn7);
        
        JButton btn8 = new JButton("8");
        btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Enter number 8
                String enterNumber = textField.getText() + btn8.getText();
                textField.setText(enterNumber);
            }
        });
        
        
        btn8.setBounds(72, 116, 60, 60);
        contentPane.add(btn8);
        
        JButton btn9 = new JButton("9");
        btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //Enter number 9
                String enterNumber = textField.getText() + btn9.getText();
                textField.setText(enterNumber);
            }
        });
        btn9.setBounds(134, 116, 60, 60);
        contentPane.add(btn9);
        
        JButton btnMinus = new JButton("-");
        btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "-";
            }
        });
        btnMinus.setBounds(196, 116, 60, 60);
        contentPane.add(btnMinus);
        
      //~~~~~~~~~~~~~~ Row 3 ~~~~~~~~~~~~~~~~~~~~~~~~~
        JButton btn4 = new JButton("4");
        btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Enter number 4
                String enterNumber = textField.getText() + btn4.getText();
                textField.setText(enterNumber);
            }
        });
        btn4.setBounds(10, 178, 60, 60);
        contentPane.add(btn4);
        
        JButton btn5 = new JButton("5");
        btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Enter number 5
                String enterNumber = textField.getText() + btn5.getText();
                textField.setText(enterNumber);
            }
        });
        btn5.setBounds(72, 178, 60, 60);
        contentPane.add(btn5);
        
        JButton btn6 = new JButton("6");
        btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //Enter number 6
                String enterNumber = textField.getText() + btn6.getText();
                textField.setText(enterNumber);
            }
        });
        btn6.setBounds(134, 178, 60, 60);
        contentPane.add(btn6);
        
        JButton btnMult = new JButton("*");
        btnMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "*";
            }
        });
        btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnMult.setBounds(196, 178, 60, 60);
        contentPane.add(btnMult);
        
      //~~~~~~~~~~~~~~ Row 4 ~~~~~~~~~~~~~~~~~~~~~~~~~
        JButton btn1 = new JButton("1");
        btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Enter number 1
                String enterNumber = textField.getText() + btn1.getText();
                textField.setText(enterNumber);
            }
        });
        btn1.setBounds(10, 240, 60, 60);
        contentPane.add(btn1);
        
        JButton btn2 = new JButton("2");
        btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Enter number 2
                String enterNumber = textField.getText() + btn2.getText();
                textField.setText(enterNumber);
            }
        });
        btn2.setBounds(72, 240, 60, 60);
        contentPane.add(btn2);
        
        JButton btn3 = new JButton("3");
        btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //Enter number 3
                String enterNumber = textField.getText() + btn3.getText();
                textField.setText(enterNumber);
            }
        });
        btn3.setBounds(134, 240, 60, 60);
        contentPane.add(btn3);
        
        JButton btnDiv = new JButton("/");
        btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "/";
            }
        });
        btnDiv.setBounds(196, 240, 60, 60);
        contentPane.add(btnDiv);
        
      //~~~~~~~~~~~~~~ Row 5 ~~~~~~~~~~~~~~~~~~~~~~~~~
        JButton btn0 = new JButton("0");
        btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Enter number 0
                String enterNumber = textField.getText() + btn0.getText();
                textField.setText(enterNumber);
            }
        });
        btn0.setBounds(10, 302, 60, 60);
        contentPane.add(btn0);
        
        JButton btnDot = new JButton(".");
        btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnDot.setBounds(72, 302, 60, 60);
        contentPane.add(btnDot);
        
        JButton btnPM = new JButton("+-");
        btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnPM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double opposite = Double.parseDouble(textField.getText());
                textField.setText(String.valueOf(opposite * (-1)));
            }
        });
        btnPM.setBounds(134, 302, 60, 60);
        contentPane.add(btnPM);
        
        JButton btnEqual = new JButton("=");
        btnEqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                                
                secondNumber = Double.parseDouble(textField.getText());
                
                if(operation == "+") 
                    result = String.format("%.2f", firstNumber + secondNumber);
                
                else if(operation == "-")
                    result = String.format("%.2f", firstNumber - secondNumber);
                
                else if(operation == "*")
                    result = String.format("%.2f", firstNumber * secondNumber);

                else if(operation == "/")
                    result = String.format("%.2f", firstNumber / secondNumber);
                
                else if(operation == "%")
                    result = String.format("%.2f", firstNumber % secondNumber);
                
                else if(operation == "")
                    return;
                
                textField.setText(result);
                
                                
            }
        });
        btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnEqual.setBounds(196, 302, 60, 60);
        contentPane.add(btnEqual);
        
    }
}
