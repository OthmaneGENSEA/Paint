import java.awt.*;
class Square extends Rectangle {

    public Square(int cote){
        super(cote,cote);
    }

    public Square(int px , int py, Color c ){

        super(px,py,c);

    }

    public void setLength (int cote){
        super.length = cote;
        super.width = cote;
    }

    public void setWidth (int cote){
        super.width = cote;
        super.length = cote;
    }

    public void setBoundingBox(int heightBB, int widthBB){

        this.length = this.width = widthBB;

    }


}

