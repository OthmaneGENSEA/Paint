import java.awt.*;
class Circle extends Ellipse {

    public Circle (int a){
        super(a,a);

    }

    public Circle(int px , int py, Color c ){


        super(px,py,c);



    }

    public void setsemiAxysX (int AxysX){
        super.semiAxysX = AxysX;
        super.semiAxysY = AxysX;
    }

    public void setsemiAxysY (int AxysY){
        super.semiAxysY = AxysY;
        super.semiAxysX = AxysY;
    }

    public void setBoundingBox(int heightBB, int widthBB){
        setsemiAxysX(heightBB);
        setsemiAxysY(widthBB);

    }


}

