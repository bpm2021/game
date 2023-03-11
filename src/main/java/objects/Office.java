package objects;

import java.awt.*;

public class Office extends Building{

    Integer width = 80;
    Integer height = 40;
    Integer x = 200;
    Integer y = 200;
    Color background = Color.blue;
    String name = "Office";
    Integer level = 0;

    public Office(){
        super.width = width;
        super.height = height;
        super.x = x;
        super.y = y;
        super.background = background;
        super.name = name;
        super.level = level;
    }
}
