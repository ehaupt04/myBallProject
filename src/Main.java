import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("yeehaw");
      System.out.println("made a comment in replit.");
        JFrame myFrame = new JFrame();
        myFrame.setSize(500,500);
        BallPanel bPanel = new BallPanel();
        //myFrame.add(myPanel);
        myFrame.add(bPanel);
        myFrame.setVisible(true);
    }
}