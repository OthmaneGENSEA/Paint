import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window2 extends JFrame implements ActionListener{
    private Drawing drawing;
    public Window2 (String title, int  length,int width){
        super (title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(0,200);
        setSize(length ,width);


        Container contentPane = getContentPane();

 String tab [] = {"New","Open","Save","Quit"};
        JMenuBar m= new JMenuBar();
        JMenuItem item [] = new JMenuItem[4];
        JMenu menu1 =new JMenu("File");

        for(int i=0;i<4;i++){
            item[i]= new JMenuItem(tab[i]) ;
            if (i==3) menu1.addSeparator();
            item[i].addActionListener(this);
            menu1.add(item[i]);
        }
        item[2].setAccelerator(KeyStroke.getKeyStroke('S',Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(),false));
        m.add(menu1);


        JMenu menu2 = new JMenu("A propos");



        JMenuItem item2 = new JMenuItem("Auteur");
        item2.addActionListener(this);
        menu2.add(item2);
        m.add(menu2);

        setJMenuBar(m);
        setVisible(true);





        drawing = new Drawing();
        contentPane .add(drawing,"Center");



        JPanel pan1=new JPanel();
        JPanel pan2=new JPanel();
        JPanel pan3=new JPanel();



        pan1.setLayout(new GridLayout(2,4));




        String tabColor []= {"Black","Red","Green","Blue","Yellow","✧･ﾟ: *✧･ﾟ:* Pink *:･ﾟ✧*:･ﾟ✧","Magenta","Orange"};

        Color color [] = {Color.black,Color.red,Color.green,Color.blue,Color.yellow,Color.pink,Color.magenta,Color.orange   };
        JButton button [] = new JButton [8] ;

        for(int i=0;i<8;i++){ button[i]=new JButton(tabColor[i]); button[i].setBackground(color[i]);
            button[i].addActionListener(this);
            pan1.add(button[i]);
        }



        String figure []= {"Ellipse","Circle","Square","Rectangle"};
        JButton fig [] = new JButton [4];
        pan2.setLayout(new GridLayout(2,2));


        for(int i=0;i< 4;i++){
            fig[i]=new JButton(figure[i]);
            fig[i].addActionListener(this);
            pan2.add(fig[i]);

        }

        pan3.setLayout(new GridLayout(1,2));
        pan3.add(pan1);
        pan3.add(pan2);
        contentPane .add(pan3,"South");





    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        String tabColor []= {"Black","Red","Green","Blue","Yellow","✧･ﾟ: *✧･ﾟ:* Pink *:･ﾟ✧*:･ﾟ✧","Magenta","Orange"};
        Color color [] = {Color.black,Color.red,Color.green,Color.blue,Color.yellow,Color.pink,Color.magenta,Color.orange   };


        if(cmd.equals("Quit")) {
            System.exit(0);
        }
        else if (cmd=="Ellipse" || cmd== "Circle"||cmd== "Square"||cmd== "Rectangle")   {
            this.drawing.setNameFigure(cmd);
        }

        else if(cmd.equals("New")) {
            this.drawing.getList ().clear();
            this.drawing.repaint();

        }

        else if(cmd.equals("Auteur")) {
            JOptionPane info = new JOptionPane();
            info.showMessageDialog(info, "Othmane GHALFI", "Author", JOptionPane.INFORMATION_MESSAGE);
//;
        }








        else   {


            for(int  i =0;i<8;i++){
                if (cmd==tabColor[i])
                {
                    drawing.setColor(color[i]) ;

                }
            }


        }









    }
}
