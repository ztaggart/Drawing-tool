package shapes;

import shapes.Shape;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape {
  private int size;
  
  public Square(int x, int y, Color color, int size) {
    super(x, y, color);
    this.size = size;
  }
  
  public void draw(Graphics g) {
    g.setColor(this.color);
    g.fillRect(this.x, this.y, this.size, this.size);
  }
}
