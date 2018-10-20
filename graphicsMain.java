import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;
public class graphicsMain{
    public static void main(String[]args){
       JFrame q = new JFrame();
       graphicsViewer w = new graphicsViewer();
       q.add(w);
       q.setVisible(true);
       class TimerListener implements ActionListener{
          public void actionPerformed(ActionEvent Event){
             if(w.getKYS().getAttached()==false){
                 w.getKYS().move();
             }
             q.repaint();
          }
       }
       ActionListener ayy = new TimerListener();
       Timer t = new Timer(10, ayy);
       t.start();
    }
}