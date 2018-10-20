import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class graphicsViewer extends JComponent{
    ArrayList<interfaceYo> a = new ArrayList<interfaceYo>();
    Ball KYS = new Ball(690);
    public graphicsViewer(){
       a.add(new background());
       a.add(new Paddle());
       a.add(KYS);
       a.add(new Blocks(700,100));
       this.addKeyListener((KeyListener)a.get(1));
       this.addKeyListener((KeyListener)KYS);
       this.setFocusable(true);
    }
    public Ball getKYS(){
        return KYS;
    }
    protected void paintComponent(Graphics g){
       for(interfaceYo i: a){
           i.appear(g);
           ((Ball)a.get(2)).Attach((Paddle)a.get(1));
       }
       repaint(); 
      
    }
}