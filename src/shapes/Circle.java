package shapes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {
  private int radius;
  
  public Circle(int x, int y, Color color, int radius) {
    super(x,y,color);
    this.radius = radius;
  }
  
  @Override
  public void draw(Graphics g) {
    g.setColor(color);
    g.fillOval(this.x - radius, y - radius, radius * 4/3, radius * 4/3);
  }
}
