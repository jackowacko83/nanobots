package nanobots;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Bot extends JComponent{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int arenaX;
	int arenaY;
	int pos_x;
	int pos_y;
	int startx;
	int starty;
	int direction;

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.RED);
		g.fillOval(pos_x,pos_y,15,15);
	}
	
	public Bot(int posX, int posY){
//		setStartingPos(arenaX, arenaY);
		this.direction=90;
		setPosition(posX, posY);
		}
	
	public void setPosition(int x, int y){
		this.pos_x = x;
		this.pos_y = y;
		this.repaint();
	}

	public void setArenaSize(int x, int y){
		arenaX=x;
		arenaY=y;
	}
	
	/**
	 * Zufälliger Startpunkt ausgehend von einer Arenagröße innerhalb der übergebenen Arenagröße
	 */
	
	public void setStartingPos(int arenaX, int arenaY){
		this.arenaX=arenaX;
		this.arenaY=arenaY;
		startx=(int) ((Math.random())*arenaX);
		starty=(int) ((Math.random())*arenaY);
		setPosition(startx, starty);
	}
	

	/**
	 * 
	 * @return returns the View
	 */
	public int getView() {
		// setzt die Sicht-Richtung des Bots
		int rand = (int) ((Math.random() + 1) * 32000) % 360;

		if (rand < 90)
			return 0;
		else if (rand < 180 && rand > 90)
			return 90;
		else if (rand < 270 && rand > 180)
			return 180;
		else if (rand < 360 && rand > 270)
			return 270;
		else
			return 360;

	}



	
}
