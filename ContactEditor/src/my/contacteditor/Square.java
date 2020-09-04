package my.contacteditor;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape {
  int size;
  
  Square(int x, int y, Color color, int size) {
    super(x, y, color);
    this.size = size;
  }
  
  public void draw(Graphics g) {
    g.setColor(this.color);
    g.fillRect(this.x, this.y, this.size, this.size);
  }
}
