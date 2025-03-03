package tabs;

import data.UserData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tab1 extends JPanel {
    private JButton b1;
    private JLabel moneyTxt, lvlTxt, xpTxt;

    public Tab1(UserData data) {
        setLayout(new BorderLayout());
        JLabel label = new JLabel("Clicker".toUpperCase(), SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 25));
        add(label, BorderLayout.NORTH);

        JPanel panel = new JPanel(new BorderLayout());
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        b1 = new JButton("Kliknij (+" + data.getClickMoney() + "zł)");
        moneyTxt = new JLabel("Pieniądze: " + data.getMoney() + "zł");
        lvlTxt = new JLabel("Poziom: " + data.getLevel());
        xpTxt = new JLabel("XP: " + data.getXP());

        moneyTxt.setFont(new Font("Arial", Font.BOLD, 20));
        lvlTxt.setFont(new Font("Arial", Font.BOLD, 20));
        xpTxt.setFont(new Font("Arial", Font.BOLD, 20));

        Dimension buttonSize = new Dimension(350, 50);
        b1.setPreferredSize(buttonSize);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                data.setMoney(data.getMoney() + data.getClickMoney());
                updateText(data);
            }
        });

        add(panel, BorderLayout.CENTER);

        panel.add(b1, BorderLayout.WEST);
        panel.add(panel2, BorderLayout.EAST);

        panel2.add(moneyTxt);
        panel2.add(lvlTxt);
        panel2.add(xpTxt);
    }

    // Method to update button text dynamically
    public void updateText(UserData data) {
        b1.setText("Kliknij (+" + data.getClickMoney() + "zł)");
        moneyTxt.setText("Pieniądze: " + data.getMoney() + "zł");
        lvlTxt.setText("Poziom: " + data.getLevel());
        xpTxt.setText("XP: " + data.getXP());
    }
}
