package objects;

import java.awt.*;

public class Building {

    protected Integer width;
    protected Integer height;
    protected Integer x;
    protected Integer y;
    protected Color background;
    protected String name;
    protected Integer level;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return name;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
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
