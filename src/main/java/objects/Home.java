package objects;

import java.awt.*;

public class Home extends Building{

    Integer width = 80;
    Integer height = 40;
    Integer x = 400;
    Integer y = 400;
    Color background = Color.green;
    String name = "Home";

    Integer level = 0;

    public Home(){
        super.width = width;
        super.height = height;
        super.x = x;
        super.y = y;
        super.background = background;
        super.name = name;
        super.level = level;
    }

}
