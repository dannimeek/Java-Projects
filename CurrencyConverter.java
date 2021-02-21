import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

public class CurrencyConverter {

    public static void main(String[] args) {

        CCApp CurrencyConverter = new CCApp("Currency Converter");

    }

}

class CCApp extends JFrame {

    JLabel lblInput, lblResult;

    JTextField txtInput, txtResult;

    JButton btnEuro, btnPound, btnDollar;

    CCApp(String title) {

        super(title);

        JMenuBar menubar = new JMenuBar();
        JMenu menu = new JMenu("File (F)");
        JMenuItem Exit = new JMenuItem("Exit (E)");
        menu.add(Exit);
        Exit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                setVisible(false);
                dispose();
                System.exit(0);

            }
        });
        menubar.add(menu);

        lblInput = new JLabel("Enter GHC");
        lblInput.setBounds(50, 20, 60, 30);
        txtInput = new JTextField("Enter Currency in Ghana Cedis");
        txtInput.setBounds(120, 20, 250, 30);

        lblResult = new JLabel("Results");
        lblResult.setBounds(60, 65, 60, 30);
        txtResult = new JTextField("The results will be displayed here");
        txtResult.setBounds(120, 65, 250, 30);
        txtResult.setEditable(false);


        btnDollar = new JButton("Dollar Button");
        btnDollar.setBounds(80, 110, 110, 30);

        btnPound = new JButton("Pound Button");
        btnPound.setBounds(190, 110, 110, 30);

        btnEuro = new JButton("Euro Button");
        btnEuro.setBounds(295, 110, 110, 30);


        btnEuro.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                try {

                    float cediAmount = Float.parseFloat(txtInput.getText());
                    float euroAmount = cediAmount / 7;
                    DecimalFormat df = new DecimalFormat("#.00");
                    String result = df.format(euroAmount);
                    txtResult.setText("€" + result);

                } catch (NumberFormatException es) {

                    JOptionPane.showMessageDialog(null, "Please Enter Numbers Only. Thank You");

                }

            }

        });

        btnDollar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                try {

                    float cediAmount = Float.parseFloat(txtInput.getText());
                    float dollarAmount = cediAmount / 6;
                    DecimalFormat df = new DecimalFormat("#.00");
                    String result = df.format(dollarAmount);
                    txtResult.setText("$" + result);

                } catch (NumberFormatException es) {

                    JOptionPane.showMessageDialog(null, "Please Enter Numbers Only. Thank You");

                }

            }

        });

        btnPound.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                try {

                    float cediAmount = Float.parseFloat(txtInput.getText());
                    float poundAmount = cediAmount / 8;
                    DecimalFormat df = new DecimalFormat("#.00");
                    String result = df.format(poundAmount);
                    txtResult.setText("" + result);

                } catch (NumberFormatException es) {

                    JOptionPane.showMessageDialog(null, "Please Enter Numbers Only. Thank You");

                }

            }

        });

        setJMenuBar(menubar);
        add(lblInput);
        add(txtInput);
        add(lblResult);
        add(txtResult);
        add(btnDollar);
        add(btnPound);
        add(btnEuro);

        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

    }
}
