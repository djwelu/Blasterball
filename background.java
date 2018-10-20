import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class background extends JFrame implements interfaceYo{
    private Image img;
    public background(){
        Image img = null;
    }
    public void getBackgroundImage(){
        try {
            File image = new File("mountainbackground.png");
            img = ImageIO.read(image);
        } catch (IOException e) {
            System.out.println("No");
        }
    }
    public void appear(Graphics g){
        this.getBackgroundImage();
        g.drawImage(img,0,0,1600,840,null);
        g.setColor(Color.lightGray);
        g.fillRect(400,0,800,840);
    }
    }
