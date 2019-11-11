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

public class Calculator extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JButton btnPlus;

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
        textField.setBounds(10, 11, 246, 32);
        contentPane.add(textField);
        textField.setColumns(10);
        
      //~~~~~~~~~~~~~~ Row 1 ~~~~~~~~~~~~~~~~~~~~~~~~~
        JButton btnBckSpace = new JButton("<-");
        btnBckSpace.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnBckSpace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnBckSpace.setBounds(10, 54, 60, 60);
        contentPane.add(btnBckSpace);
        
        JButton btnClear = new JButton("C");
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnClear.setBounds(72, 54, 60, 60);
        contentPane.add(btnClear);
        
        JButton btnPercent  = new JButton("%");
        btnPercent.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnPercent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnPercent.setBounds(134, 54, 60, 60);
        contentPane.add(btnPercent);
        
        btnPlus = new JButton("+");
        btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnPlus.setBounds(196, 54, 60, 60);
        contentPane.add(btnPlus);
        
        
        //~~~~~~~~~~~~~~ 1st Row ~~~~~~~~~~~~~~~~~~~~~~~~~
        JButton btn7 = new JButton("7");
        btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btn7.setBounds(10, 116, 60, 60);
        contentPane.add(btn7);
        
        JButton btn8 = new JButton("8");
        btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn8.setBounds(72, 116, 60, 60);
        contentPane.add(btn8);
        
        JButton btn9 = new JButton("9");
        btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btn9.setBounds(134, 116, 60, 60);
        contentPane.add(btn9);
        
        btnPlus = new JButton("+");
        btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnPlus.setBounds(196, 116, 60, 60);
        contentPane.add(btnPlus);
        
      //~~~~~~~~~~~~~~ 2nd Row ~~~~~~~~~~~~~~~~~~~~~~~~~
        JButton btn4 = new JButton("4");
        btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btn4.setBounds(10, 178, 60, 60);
        contentPane.add(btn4);
        
        JButton btn5 = new JButton("5");
        btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn5.setBounds(72, 178, 60, 60);
        contentPane.add(btn5);
        
        JButton btn6 = new JButton("6");
        btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btn6.setBounds(134, 178, 60, 60);
        contentPane.add(btn6);
        
        JButton btnMinus = new JButton("-");
        btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnMinus.setBounds(196, 178, 60, 60);
        contentPane.add(btnMinus);
        
      //~~~~~~~~~~~~~~ 3rd Row ~~~~~~~~~~~~~~~~~~~~~~~~~
        JButton btn1 = new JButton("1");
        btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btn1.setBounds(10, 240, 60, 60);
        contentPane.add(btn1);
        
        JButton btn2 = new JButton("2");
        btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn2.setBounds(72, 240, 60, 60);
        contentPane.add(btn2);
        
        JButton btn3 = new JButton("3");
        btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btn3.setBounds(134, 240, 60, 60);
        contentPane.add(btn3);
        
        JButton btnMult = new JButton("*");
        btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnMult.setBounds(196, 240, 60, 60);
        contentPane.add(btnMult);
        
      //~~~~~~~~~~~~~~ 4th Row ~~~~~~~~~~~~~~~~~~~~~~~~~
        JButton btn0 = new JButton("0");
        btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
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
            }
        });
        btnPM.setBounds(134, 302, 60, 60);
        contentPane.add(btnPM);
        
        JButton btnEqual = new JButton("=");
        btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnEqual.setBounds(196, 302, 60, 60);
        contentPane.add(btnEqual);
        
    }
}
