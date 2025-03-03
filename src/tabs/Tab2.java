package tabs;

import data.UserData;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tab2 extends JPanel {
    JButton lUB1, lUB2;
    JButton lUB1a, lUB2a;
    int[] upgCost = {10, 50}; // 0 - upg1, 1 - upg2
    int[] itmCost = {1000, 5000}; // 00 - itm1, 1 - itm2

    public Tab2(UserData data) {
        Border solidBorder = new LineBorder(Color.BLACK, 2);
        Border padding = new EmptyBorder(20, 20, 20, 20);
        Border compoundBorder = new CompoundBorder(solidBorder, padding);

        this.setBorder(padding);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));



        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));  // Use BoxLayout for panel2
        JPanel panel2a = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panel2b = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JPanel panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
        panel3.setPreferredSize(new Dimension(200,350));
        JPanel panel3a = new JPanel();
        panel3a.setLayout(new BoxLayout(panel3a, BoxLayout.Y_AXIS));
        panel3a.setPreferredSize(new Dimension(200,350));

        JPanel panel4 = new JPanel();
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
        panel4.setPreferredSize(new Dimension(200,350));
        JPanel panel4a = new JPanel();
        panel4a.setLayout(new BoxLayout(panel4a, BoxLayout.Y_AXIS));
        panel4a.setPreferredSize(new Dimension(200,350));



        JLabel label = new JLabel("Sklep".toUpperCase(), SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 25));

        JLabel l1 = new JLabel("Ulepszenia".toUpperCase());
        l1.setFont(new Font("Arial", Font.PLAIN, 20));
        JLabel l2 = new JLabel("Skrzynki".toUpperCase());
        l2.setFont(new Font("Arial", Font.PLAIN, 20));

        JLabel lUT1 = new JLabel("<html>Więcej pieniędzy</html>".toUpperCase());
        lUT1.setFont(new Font("Arial", Font.BOLD, 15));
        JLabel lUD1 = new JLabel("<html>To ulepszenie zwiększa ilośc pozyskanych pieniędzy za klikanie o +1zł</html>".toUpperCase());
        lUD1.setFont(new Font("Arial", Font.PLAIN, 12));
        lUB1 = new JButton("KUP " + upgCost[0] + "zł");

        lUB1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data.getMoney() >= upgCost[0]) {
                    data.setMoney(data.getMoney() - upgCost[0]);
                    upgCost[0] += 5;
                    data.setClickMoney(data.getClickMoney() + 1);
                    updateText();
                }
            }
        });

        ImageIcon iiU1 = new ImageIcon(getClass().getResource("/assets/img/cursors.jpg"));
        Image temp = iiU1.getImage();
        Image temp2 = temp.getScaledInstance(150,150, Image.SCALE_SMOOTH);
        iiU1 = new ImageIcon(temp2);
        JLabel lUII1 = new JLabel(iiU1);
        lUII1.setBorder(solidBorder);



        JLabel lUT2 = new JLabel("<html>Więcej pieniędzy v2</html>".toUpperCase());
        lUT2.setFont(new Font("Arial", Font.BOLD, 15));
        JLabel lUD2 = new JLabel("<html>To ulepszenie zwiększa ilośc pozyskanych pieniędzy za klikanie o +10zł</html>".toUpperCase());
        lUD2.setFont(new Font("Arial", Font.PLAIN, 12));
        lUB2 = new JButton("KUP " + upgCost[1] + "zł");

        lUB2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data.getMoney() >= upgCost[1]) {
                    data.setMoney(data.getMoney() - upgCost[1]);
                    upgCost[1] += 25;
                    data.setClickMoney(data.getClickMoney() + 10);
                    updateText();
                }
            }
        });

        ImageIcon iiU2 = new ImageIcon(getClass().getResource("/assets/img/cursors2.jpg"));
        Image tempa = iiU2.getImage();
        Image temp2a = tempa.getScaledInstance(150,150, Image.SCALE_SMOOTH);
        iiU2 = new ImageIcon(temp2a);
        JLabel lUII2 = new JLabel(iiU2);
        lUII2.setBorder(solidBorder);


        JLabel lUT1a = new JLabel("<html>Skrzynka BASIC</html>".toUpperCase());
        lUT1a.setFont(new Font("Arial", Font.BOLD, 15));
        JLabel lUD1a = new JLabel("<html>Skrzynka zawiera jedną losową broń jakości BASIC</html>".toUpperCase());
        lUD1a.setFont(new Font("Arial", Font.PLAIN, 12));
        lUB1a = new JButton("KUP " + itmCost[0] + "zł");

        lUB1a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data.getMoney() >= itmCost[0]) {
                    data.setMoney(data.getMoney() - itmCost[0]);
                    updateText();
                }
            }
        });

        ImageIcon iiU1a = new ImageIcon(getClass().getResource("/assets/img/chest.jpg"));
        Image tempb = iiU1a.getImage();
        Image temp2b = tempb.getScaledInstance(150,150, Image.SCALE_SMOOTH);
        iiU1a = new ImageIcon(temp2b);
        JLabel lUII1a = new JLabel(iiU1a);
        lUII1a.setBorder(solidBorder);


        JLabel lUT2a = new JLabel("<html>Skrzynka ADVANCE</html>".toUpperCase());
        lUT2a.setFont(new Font("Arial", Font.BOLD, 15));
        JLabel lUD2a = new JLabel("<html>Skrzynka zawiera jedną losową broń jakości ADVANCE</html>".toUpperCase());
        lUD2a.setFont(new Font("Arial", Font.PLAIN, 12));
        lUB2a = new JButton("KUP " + itmCost[1] + "zł");

        lUB2a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data.getMoney() >= itmCost[1]) {
                    data.setMoney(data.getMoney() - itmCost[1]);
                    updateText();
                }
            }
        });

        ImageIcon iiU2a = new ImageIcon(getClass().getResource("/assets/img/chest2.png"));
        Image tempc = iiU2a.getImage();
        Image temp2c = tempc.getScaledInstance(150,150, Image.SCALE_SMOOTH);
        iiU2a = new ImageIcon(temp2c);
        JLabel lUII2a = new JLabel(iiU2a);
        lUII2a.setBorder(solidBorder);

        panel2.setBorder(compoundBorder);
        panel3.setBorder(compoundBorder);
        panel3a.setBorder(compoundBorder);
        panel4.setBorder(compoundBorder);
        panel4a.setBorder(compoundBorder);

        add(panel1);
        add(panel2);

        panel1.add(label);
        panel2.add(l1);
        panel2.add(panel2a);
        panel2a.add(panel3);
        panel2a.add(panel4);
        panel2.add(l2);
        panel2.add(panel2b);
        panel2b.add(panel3a);
        panel2b.add(panel4a);

        panel3.add(lUT1);
        panel3.add(Box.createVerticalStrut(5));
        panel3.add(lUD1);
        panel3.add(Box.createVerticalStrut(5));
        panel3.add(lUII1);
        panel3.add(Box.createVerticalStrut(5));
        panel3.add(lUB1);

        panel3a.add(lUT1a);
        panel3a.add(Box.createVerticalStrut(5));
        panel3a.add(lUD1a);
        panel3a.add(Box.createVerticalStrut(5));
        panel3a.add(lUII1a);
        panel3a.add(Box.createVerticalStrut(5));
        panel3a.add(lUB1a);

        panel4.add(lUT2);
        panel4.add(Box.createVerticalStrut(5));
        panel4.add(lUD2);
        panel4.add(Box.createVerticalStrut(5));
        panel4.add(lUII2);
        panel4.add(Box.createVerticalStrut(5));
        panel4.add(lUB2);

        panel4a.add(lUT2a);
        panel4a.add(Box.createVerticalStrut(5));
        panel4a.add(lUD2a);
        panel4a.add(Box.createVerticalStrut(5));
        panel4a.add(lUII2a);
        panel4a.add(Box.createVerticalStrut(5));
        panel4a.add(lUB2a);
    }


    public void updateText() {
        lUB1.setText("KUP " + upgCost[0] + "zł");
        lUB2.setText("KUP " + upgCost[1] + "zł");
    }
}
