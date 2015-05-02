package snake;

import java.awt.Color;
import java.awt.Graphics;

public class BadApple {
private int x, y, width, height;
	
	public BadApple(int x, int y, int tileSize) {
		this.x = x;
		this.y = y;
		width = tileSize;
		height = tileSize;
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(x * width, y * height, width, height);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}