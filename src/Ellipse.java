import java.awt.*;

class Ellipse extends Figure{

    int semiAxysX;
    int semiAxysY;

    public Ellipse(int a , int b ){

        semiAxysX = a;

        semiAxysY = b;




    }

    public Ellipse(int px , int py, Color c ){


        super(new Point(px,py),c);

        this.semiAxysX = 0;
        this.semiAxysY = 0;


    }


    public double getPerimeter  (){
        double c= 2*Math.PI*Math.sqrt(((semiAxysY ^2)+(semiAxysX ^2))/2);
        return c;



    }

    public  double getSurface (){

        double c= Math.PI* semiAxysX * semiAxysY *(1/4);

        return c;

    }

    public  void setBoundingBox(int heightBB, int widthBB){



        this.semiAxysX = heightBB;
        this.semiAxysY = widthBB;



    }



    public  void draw(Graphics g){




        g.setColor(super.c);
        g.fillOval(super.origin.x,super.origin.y,this.semiAxysY,this.semiAxysX);


    }

}
