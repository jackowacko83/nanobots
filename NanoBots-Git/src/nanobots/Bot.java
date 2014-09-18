package nanobots;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Bot extends JComponent{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * arenaX/Y Arenagroesse
	 * pos_x/y Bot-Position
	 * startx/y Startposition
	 * direction Blickrichtung
	 * size Botgroesse
	 * color Koerperfarbe
	 */
	int arenaX; 
	int arenaY;
	double pos_x;
	double pos_y;
	double startx;
	double starty;
	double direction;
	double size;
	Color color;
	int sightRadius=40;

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(color);
		fillCircle(g, pos_x, pos_y, (int)size/2);
//		deprecated
	//	g.fillOval((int)pos_x, (int)pos_y,(int)size,(int)size);
		/*
		 * Visualisierung des Auges. Soll in die Richtung von direction schauen. 
		 * Wahrscheinlich wegen Rechenfehler durch toRadians musste nachkorrigiert werden mit -this.size/4
		 */
		g.setColor(Color.BLACK);
//		g.drawLine((int)pos_x, (int)pos_y, (int)(pos_x+(Math.sin(Math.toRadians(this.direction))*this.size/2)), (int)(pos_y+(Math.cos(Math.toRadians(this.direction))*this.size/2)));
		fillCircle(g, pos_x+(Math.sin(Math.toRadians(this.direction))*this.size/2), pos_y-(Math.cos(Math.toRadians(this.direction))*this.size/2), (int)size/8);
//		deprecated
//		g.fillOval
//			(
//				(int)(this.size/2+pos_x+(Math.sin(Math.toRadians(this.direction))*this.size/2)-this.size/8), 
//				(int)(this.size/2+pos_y-(Math.cos(Math.toRadians(this.direction))*this.size/2)-this.size/8),
//				(int) this.size/4, (int) this.size/4
//			);
//		Sightrectangle		
		g.drawLine((int)(pos_x+(Math.sin(Math.toRadians(this.direction))*this.size/2)), (int)(pos_y-(Math.cos(Math.toRadians(this.direction))*this.size/2)), (int)(pos_x+Math.sin(Math.toRadians(this.direction-sightRadius/2))*150), (int)(pos_y-Math.cos(Math.toRadians(this.direction-sightRadius/2))*150));
		g.drawLine((int)(pos_x+(Math.sin(Math.toRadians(this.direction))*this.size/2)), (int)(pos_y-(Math.cos(Math.toRadians(this.direction))*this.size/2)), (int)(pos_x+Math.sin(Math.toRadians(this.direction+sightRadius/2))*150), (int)(pos_y-Math.cos(Math.toRadians(this.direction+sightRadius/2))*150));
		g.drawLine((int)(pos_x+Math.sin(Math.toRadians(this.direction-sightRadius/2))*150), (int)(pos_y-Math.cos(Math.toRadians(this.direction-sightRadius/2))*150), (int)(pos_x+Math.sin(Math.toRadians(this.direction+sightRadius/2))*150), (int)(pos_y-Math.cos(Math.toRadians(this.direction+sightRadius/2))*150));
	}
	
	public Bot(double posX, double posY){
//		setStartingPos(arenaX, arenaY);
		this.direction=45;
		setPosition(posX, posY);
		}
	
	public Bot(){
		this.direction=0;
		this.size=16;
		this.color=Color.RED;
	}
	
	public void setPosition(double x, double y){
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
		startx=((Math.random())*arenaX);
		starty=((Math.random())*arenaY);
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

	public void setDirection(double dir){
		this.direction=dir;
	}
	
	public void setColor(Color c){
		this.color = c;
	}
	
	public void fillCircle(Graphics g, double x, double y, int r){
		g.fillOval((int) (x-r), (int)(y-r), 2*r, 2*r);
	}

	
}
