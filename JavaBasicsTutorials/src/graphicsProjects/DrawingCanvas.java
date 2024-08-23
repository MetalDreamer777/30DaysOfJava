package graphicsProjects;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class DrawingCanvas extends JComponent {
	
	private int width;
	private int hight;
	
	public DrawingCanvas(int w, int h) {
		width = w;
		hight = h;
	}
	
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		Rectangle2D.Double r = new Rectangle2D.Double(50, 70, 100, 250);
		g2d.setColor(new Color(100,149,237));
		g2d.fill(r);
		
		
		
	}
}


