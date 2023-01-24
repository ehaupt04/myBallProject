import java.awt.*;

public class Ball
{

    private int x,y,xAdd,yAdd,radius, diameter;
    private Color col;

    public Ball()
    {
        x = (int)(Math.random()*380 + 2);
        y = (int)(Math.random()*380 + 2);
        radius = (int)(Math.random()*41+10);
        diameter = 2 * radius;
        col = Color.RED;
        xAdd = 1;
    }

    public void bounce()
    {
        if(x == 400 - diameter)
        {
            xAdd = xAdd*(-1);
        }

    }

    public void moveUp()
    {
        y--;
    }
    public void moveDown()
    {
        y++;
    }
    public void moveLeft()
    {
        x++;
    }
    public void  moveRight()
    {
        x--;
    }

    public void draw(Graphics g)
    {
        g.setColor(col);
        g.fillOval(x, y,diameter,diameter);
    }

}