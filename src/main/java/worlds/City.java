package worlds;

import objects.Building;
import objects.Home;
import objects.Office;

import java.awt.*;
import java.util.ArrayList;

public class City {
    private Integer width = 800;
    private Integer height = 800;
    private Color background = Color.black;

    private ArrayList<Building> cityObjects = new ArrayList<Building>();

    private Home home = new Home();
    private Office office = new Office();

    public ArrayList<Building> getCityObjects() {
        cityObjects.add(home);
        cityObjects.add(office);
        return cityObjects;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Color getBackgroundColor() {
        return background;
    }
}
