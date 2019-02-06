package CardPuzzle;

import java.awt.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.JOptionPane;


public class GeneralCardLayoutSquare extends Applet {
    fivebyfive _panel;
    fourbyfour _Spanel;
    threeByThree _SSpanel;


    public void init() {

        JTextField field1 = new JTextField();
        JLabel label1 = new JLabel("5-5x5");
        JLabel label2 = new JLabel("4-4x4");
        JLabel label3 = new JLabel("3-3x3");
        Object[] message = {
                label1, label2, label3,
                "Select Choice:", field1,
        };

        CardLayout cardLayout = new CardLayout();
        setLayout(cardLayout);

        _panel = new fivebyfive();
        _panel.init();
        add("_panel", _panel);

        _Spanel = new fourbyfour();
        _Spanel.init();
        add("_Spanel", _Spanel);

        _SSpanel = new threeByThree();
        _SSpanel.init();
        add("_SSpanel", _SSpanel);

        int option = JOptionPane.showConfirmDialog(this, message, "Select Value", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION) {
            String value1 = field1.getText();
            if (value1.equals("5")) {
                cardLayout.show(this, "_panel");
            } else if (value1.equals("4")) {
                cardLayout.show(this, "_Spanel");
            } else if (value1.equals("3")) {
                cardLayout.show(this, "_SSpanel");
            }
        }
    }

    public void update(Graphics g) {
        if (_panel != null)
            _panel.paint(g);
        if (_Spanel != null)
            _Spanel.paint(g);
        if (_SSpanel != null)
            _SSpanel.paint(g);

        paint(g);
    }
}






