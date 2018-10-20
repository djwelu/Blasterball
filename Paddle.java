import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Paddle implements interfaceYo, KeyListener{
    private int x;
   public Paddle(){
        this.x = 600;
   }
   public void appear(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(x,720,100,15);
   }
   public int getX(){
       return x;
   }
   public void keyPressed(KeyEvent e){
       int arrow = e.getKeyCode();
       if(arrow==KeyEvent.VK_LEFT){
           if(x<=400){
               x=400;
            }
            else{
                x-=35;
            }
       }
       if(arrow==KeyEvent.VK_RIGHT){
           if(x>1000){
                    x=1100;
            }
            else{
                    x+=35;
                }
       }
   }
   public void keyTyped(KeyEvent e){}
   public void keyReleased(KeyEvent e){}
}
        