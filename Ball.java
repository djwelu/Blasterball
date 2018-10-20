import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ball implements interfaceYo, KeyListener{
    private int ballx;
    private int bally;
    private int ballVelocity;
    private boolean isAttached;
    public Ball(int bally){
        this.ballx = ballx;
        this.bally = bally;
        ballVelocity = 5;
        isAttached = true;
    }
    public int getBallx(){
        return ballx;
    }
    public int getBally(){
        return bally;
    }
    public boolean getAttached(){
        return isAttached;
    }
    public void appear(Graphics g){
        g.setColor(Color.orange);
        g.fillOval(ballx,bally,30,30);
    }
    public void Attach(Paddle p){
        if(isAttached==true){
            ballx = p.getX()+35;
        }
    }
    public void move(){
        int x = 1;
        int y = -1;
        if(this.getBallx()<1170){
            ballx += ballVelocity*x;
            bally += ballVelocity*y;
        }
        if(this.getBallx()==1170){
            x=(-1);
        }
    }  
    public void keyPressed(KeyEvent e){
        if(isAttached==true){
            if(e.getKeyCode()==KeyEvent.VK_SPACE){
                isAttached=false;
            }
        }
    }
    public void keyTyped(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
}
