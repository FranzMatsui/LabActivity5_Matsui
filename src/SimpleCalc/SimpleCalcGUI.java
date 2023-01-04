package SimpleCalc;

import javax.swing.*;
import javax.awt.event.ActionEvent;
import javax.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private Japanel mainPanel;
    private JTextField tf1Number;
    private JComboBox cmbSymbol;
    private JButton btnResult;
    private JPanel mainPanel1;
    private JPanel panel1;
    private JLabel jl1Number;
    private JLabel jl2Number;
    private JPanel panel2;
    private JTextField tf2Number;
    private JPanel panel3;
    private JLabel jlResult;
    private JTextField tfResult;

    public SimpleCalcGUI(){
        setContentPane(mainPanel);
        setTitle("Simple Calculator");
        setSize(550, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        cmbSymbol.addItem("+");
        cmbSymbol.addItem("-");
        cmbSymbol.addItem("*");
        cmbSymbol.addItem("/");

        btnResult.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                try{
                    int n1 = Integer.parseInt(tf1Number.getText());
                    int n2 = Integer.parserInt(tf2Number.getText());
                    int result = 0;
                    String sym = cmbSymbol.getSelectedItem().toString();
                    if (sym == "+"){
                        result = n1 + n2;
                        tfResult.setText(String.valueOf(result));
                    }
                    else if (sym == "-"){
                        result = n1 - n2;
                        tfResult.setText(String.valueOf(result));
                    }
                    else if (sym == "*"){
                        result = n1 * n2;
                        tfResult.setText(String.valueOf(result));
                    }
                    else {
                        result = n1 / n2;
                        tfResult.setText(String.valueof(result));
                    }
                } catch(NumberFormatException nfe) {
                    JFrame f = new SimpleCalcGUI();
                    JOptionPane.showMessageDialog(f, "Invalid Input");
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI calcu = new SimpleCalcGUI();
    }
}
