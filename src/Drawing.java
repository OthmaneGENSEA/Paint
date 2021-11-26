import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class Drawing extends JPanel implements MouseListener, MouseMotionListener{
    private ArrayList<Figure> list;
    private Color c;
    private String nameFigure;
    private int position_x;
    private int position_y;
    MouseEvent e;
    public Drawing(){

        super();

        this.list =new ArrayList<Figure>();
        addMouseListener(this);
        addMouseMotionListener(this);

    }

    public void paintComponent(Graphics g){


        super.paintComponent(g);

        for (Figure f : list){


            f.draw(g);

        }


    }

    public void setColor(Color m){

        this.c= m;
    }


    public  void setNameFigure(String o){

        this.nameFigure = o;

    }

    public String getNameFigure(){

        return nameFigure;

    }


    public Color getColor(){

        return c;

    }

    public ArrayList<Figure> getList (){

        return this.list;


    }
    public void mouseClicked(MouseEvent e ){



    }
    public void mouseExited(MouseEvent e ){



    }

    public void mouseEntered(MouseEvent e ){



    }
    public void mousePressed(MouseEvent e ){


        position_x = e.getX();
        position_y = e.getY();



        if (nameFigure.equals("Rectangle")){
            list.add(new Rectangle(position_x,position_y,c));}
        if (nameFigure.equals("Square")){
            list.add(new Square(position_x,position_y,c));}
        if (nameFigure.equals("Circle")){
            list.add(new Circle(position_x,position_y,c));}
        if (nameFigure.equals("Ellipse")){
            list.add(new Ellipse(position_x,position_y,c));}

    }

    public void mouseReleased(MouseEvent e ){

        int b =Math.abs(e.getX()-position_x);
        int a =Math.abs(e.getY()-position_y);

        int size = this.list.size();




        Figure bob = list.get(size-1);



        if( e.getX()<position_x){
            bob.origin.setX(e.getX());

        }


        if( e.getY()<position_y){
            bob.origin.setY(e.getY());

        }


        bob.setBoundingBox(a,b);



        repaint();


    }

    public void mouseMoved( MouseEvent e){


    }

    public void mouseDragged(MouseEvent e ){


        int b =Math.abs(e.getX()-position_x);
        int a =Math.abs(e.getY()-position_y);

        int size =this.list.size();




        Figure bob = list.get(size-1);



        if( e.getX()<position_x){
            bob.origin.setX(e.getX());

        }

        if( e.getY()<position_y){
            bob.origin.setY(e.getY());

        }


        bob.setBoundingBox(a,b);


        repaint();

    }


}
