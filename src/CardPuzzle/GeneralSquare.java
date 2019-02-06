package CardPuzzle;

import java.awt.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.JOptionPane;


public class GeneralSquare extends Applet {
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

        setLayout(new BorderLayout());


        int option = JOptionPane.showConfirmDialog(this, message, "Select Value", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION) {
            String value1 = field1.getText();
            if (value1.equals("5")) {
                _panel = new fivebyfive();
                _panel.init();
                add(_panel, BorderLayout.CENTER);
            } else if (value1.equals("4")) {
                _Spanel = new fourbyfour();
                _Spanel.init();
                add(_Spanel, BorderLayout.CENTER);
            } else if (value1.equals("3")) {
                _SSpanel = new threeByThree();
                _SSpanel.init();
                add(_SSpanel, BorderLayout.CENTER);
            }
        }


    }

    public void update(Graphics g) {
        if (_panel != null)
            _panel.paint(g);
        if (_Spanel != null)
            _Spanel.paint(g);

        paint(g);
    }
}




	
	
