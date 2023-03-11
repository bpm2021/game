package org.project;

import worlds.City;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;

public class Main {
    private static City city = new City();

    public static void main(String[] args) {

        JFrame frame;

        frame= new JFrame("Game window");



        frame.setSize(city.getWidth(), city.getHeight());

        frame.getContentPane().setBackground(city.getBackgroundColor());

        int number = city.getCityObjects().size();

        for(int i = 0; i <= number; i++) {

            JPanel panel = new JPanel();

            panel.setLayout(null);

            panel.setSize(
                    city.getCityObjects().get(i).getWidth(),
                    city.getCityObjects().get(i).getHeight()
            );
            panel.setLocation(
                    city.getCityObjects().get(i).getX() - city.getCityObjects().get(i).getWidth()/2,
                    city.getCityObjects().get(i).getY() - city.getCityObjects().get(i).getHeight()/2);

            panel.setBackground(
                    city.getCityObjects().get(i).getBackgroundColor()
            );

            String title = city.getCityObjects().get(i).toString();

            Border border = BorderFactory.createTitledBorder(
                    new LineBorder(Color.BLACK, 4, true),
                    title,
                    TitledBorder.CENTER,
                    TitledBorder.TOP,
                    new Font("times new roman",Font.PLAIN,12),
                    Color.black
            );

            JLabel jlabel = new JLabel(city.getCityObjects().get(i).getLevel().toString());
//            jlabel.setFont(new Font("Verdana",1,20));
//            jlabel.setBounds(40, 40, 10, 10);

            Dimension size = jlabel.getPreferredSize();
            jlabel.setBounds(panel.getPreferredSize().width/2 - size.width/2,
                    panel.getPreferredSize().height/2 - size.height/2,
                    size.width,
                    size.height
            );

            panel.add(jlabel);
            panel.setBorder(border);

            frame.add(panel);

        }


        frame.setLocationRelativeTo(null);

        frame.setLayout(null);

        frame.setVisible(true);
    }
}