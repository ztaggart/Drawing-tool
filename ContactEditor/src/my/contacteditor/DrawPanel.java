package my.contacteditor;


import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics2D;
import java.io.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;

// Panel for drawing
public class DrawPanel extends JPanel{
    ArrayList<Shape> shapes;
    BufferedImage background;
    
    public DrawPanel() {
        shapes = new ArrayList<Shape>();
        background = new BufferedImage(500, 500, BufferedImage.TYPE_4BYTE_ABGR);
        Graphics2D g2d = background.createGraphics();
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, 500, 500);
    }
    
    public void addShape(Shape shape) {
        shapes.add(shape);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(background, 0, 0, this);
        for(Shape s: shapes)
            s.draw(g);
    }
    
    void reset() {
        shapes = new ArrayList<Shape>();
    }
    
    void save(String fileName) throws IOException {
       BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_4BYTE_ABGR);
       Graphics g2 = image.createGraphics();
       paint(g2);
       ImageIO.write(image, "PNG" , new File(fileName + ".png"));
    }
    
    void loadImage(File file) throws IOException {
        background = ImageIO.read(file);
    }
}
