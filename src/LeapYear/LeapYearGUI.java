package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{

    private JPanel mainPanel1;

    private JPanel mainPanel2;

    private JLabel jlYear;
    private JTextField tfYear;
    private JButton btnCheckYear;

        public LeapYearGUI() {
            setContentPane(mainPanel1);
            setTitle("Leap Year Checker");
            setSize(450,300);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setVisible(true);

            btnCheckYear.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JFrame f = new LeapYearGUI();
                    try{
                        String year = tfYear.getText();
                        int y = Interger.parseInt(year);
                        if(((y % 4 == 0) && (y % 100!= 0)) || (y % 400 == 0))
                            JOptionPane.showMessageDialog(f, "Leap Year");
                        else {
                            JOptionPane.showMessageDialog(f, "Not a leap year");
                        }
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(f, "Invalide Input");
                    }
                }
            });
        }

    public static void main(String[] args) {
        LeapYearGUI leapYearChecker = new LeapYearGUI();
    }
}
