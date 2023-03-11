package org.project;

import worlds.City;

import javax.swing.*;

public class Main {
    private static City city = new City();

    public static void main(String[] args) {
        JFrame frame;

        frame=new JFrame("Game window");

        frame.setSize(city.getWidth(), city.getHeight());

        frame.getContentPane().setBackground(city.getBackgroundColor());

        int number = city.getCityObjects().size();

        for(int i = 0; i <= number; i++) {
            JPanel panel = new JPanel();

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
            frame.add(panel);

        }


        frame.setLocationRelativeTo(null);

        frame.setLayout(null);

        frame.setVisible(true);
    }
}