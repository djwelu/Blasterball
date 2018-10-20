import java.awt.*;
import java.awt.Color;
import java.util.ArrayList;
public class Blocks implements interfaceYo{
    private int x;
    private int y;
    private ArrayList<Color> colors;
    public Blocks(int x, int y){
        this.x = x;
        this.y = y;
        colors = new ArrayList<Color>();
        colors.add(Color.red);
        colors.add(Color.blue);
        colors.add(Color.green);
        colors.add(Color.orange);
        colors.add(Color.pink);
        colors.add(Color.yellow);
    }
    public void appear(Graphics g){
        g.setColor(colors.get((int)(Math.random()*6)));
        g.fillRect(x,y,80,40);
    }
}
   