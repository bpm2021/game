package objects;

import java.awt.*;
public class Farm extends Building{

    Integer width = 80;
    Integer height = 40;
    Integer x = 600;
    Integer y = 200;
    Color background = Color.red;
    String name = "Farm";

    Integer level = 0;

    public Farm(){
        super.width = width;
        super.height = height;
        super.x = x;
        super.y = y;
        super.background = background;
        super.name = name;
        super.level = level;
    }


}