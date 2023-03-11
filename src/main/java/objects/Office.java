package objects;

import java.awt.*;

public class Office extends Building{

    Integer width = 40;
    Integer height = 40;

    Integer x = 200;
    Integer y = 200;
    Color background = Color.blue;

    public Office(){
        super.width = width;
        super.height = height;
        super.x = x;
        super.y = y;
        super.background = background;
    }
}
