
import java.awt.*;  
import javax.swing.JFrame;  
  
public class HelloWorld extends Canvas{  
      
    public void paint(Graphics g) {  
        setBackground(Color.white); 
        setForeground(Color.black);   
        g.drawString("Computer Graphics",120,50);  
 			
        g.fillRect(50, 80,250,200);
        g.fillOval(125,280,110,30);
	g.setColor(Color.blue);
        g.fillRect(55,85,240,190);
        g.setColor(Color.white);
        g.drawLine(65,130,285,130);//1
      //  g.drawLine(65,95,285,95);
        g.drawLine(65,230,285,230);
        g.drawLine(65,230,180,90);
        g.drawLine(285,230,180,90);
        g.drawLine(65,130,180,270);
        g.drawLine(180,270,285,130);
        g.drawString("TU",170,190); 
    }  
        public static void main(String[] args) {  
        HelloWorld m = new HelloWorld();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        //f.setLayout(null);  
        f.setVisible(true);  
    }  
  
}
