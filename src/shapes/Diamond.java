package shapes;

import shapes.Shape;

import java.awt.Color;
import java.awt.Graphics;

public class Diamond extends Shape {
  private int length;
  private int[] xPoints;
  private int[] yPoints;
  
  public Diamond(int x, int y, Color color, int length) {
    super(x,y,color);
    this.length = length;
    createPoints();
  }
  
  @Override
  public void draw(Graphics g) {
    g.setColor(this.color);
    g.fillPolygon(xPoints, yPoints, xPoints.length);
  }
  
  void createPoints() {
    xPoints = new int[4];
    xPoints[0] = x;
    xPoints[1] = x + length * 3/4;
    xPoints[2] = x;
    xPoints[3] = x - length * 3/4;
    yPoints = new int[4];
    yPoints[0] = y + length * 3/4;
    yPoints[1] = y;
    yPoints[2] = y - length * 3/4;
    yPoints[3] = y;
  }
}
