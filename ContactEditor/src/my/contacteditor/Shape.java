package my.contacteditor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
  int x;
  int y;
  Color color;
  
  public Shape(int x, int y, Color color) {
    this.x = x;
    this.y = y;
    this.color = color;
  }
  
  abstract void draw(Graphics g);
}
