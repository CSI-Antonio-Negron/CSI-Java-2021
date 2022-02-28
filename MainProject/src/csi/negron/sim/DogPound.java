package csi.negron.inheritance;

import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;

public class DogPound extends JPanel{
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(background, 0, 0, null);
		doDrawing(g);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if (inGame) {

			checkApple();
			checkMine();
			checkCollision();
			move();
		}

		repaint();
	}


}
