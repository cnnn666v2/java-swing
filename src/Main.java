import data.UserData;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        UserData uData = new UserData(0, 1, 0, 0);
        String project_name = "Projekt Swing";

        JFrame frame = new JFrame(project_name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 1000);
        frame.setMinimumSize(new Dimension(800, 600));

        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Clicker", new tabs.Tab1(uData));
        tabbedPane.addTab("Sklep", new tabs.Tab2(uData));
        tabbedPane.addTab("Ekwipunek", new tabs.Tab3());
        tabbedPane.addTab("Wyposażenie", new tabs.Tab4());

        frame.add(tabbedPane, BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}