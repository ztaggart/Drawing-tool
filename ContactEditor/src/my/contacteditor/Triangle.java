package my.contacteditor;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Shape {
  int length;
  int[] xPoints;
  int[] yPoints;
  
  public Triangle(int x, int y, Color color, int length) {
    super(x,y,color);
    this.length = length;
    createPoints();
  }
  
  @Override
  void draw(Graphics g) {
    g.setColor(this.color);
    g.fillPolygon(xPoints, yPoints, xPoints.length);
  }
  
  void createPoints() {
    xPoints = new int[3];
    xPoints[0] = x;
    xPoints[1] = x+(length * 3/4);
    xPoints[2] = x-(length * 3/4);
    yPoints = new int[3];
    yPoints[0] = y-(length * 3/4);
    yPoints[1] = y+(length * 3/4);
    yPoints[2] = y+(length * 3/4);
  }

}
