package objects;

import java.awt.*;

public class Home extends Building{

    Integer width = 40;
    Integer height = 40;

    Integer x = 400;
    Integer y = 400;

    Color background = Color.green;

    public Home(){
        super.width = width;
        super.height = height;
        super.x = x;
        super.y = y;
        super.background = background;
    }

}
