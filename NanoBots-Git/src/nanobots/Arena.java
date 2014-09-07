package nanobots;

import java.awt.Color;

import javax.swing.JFrame;

public class Arena extends Thread{
	JFrame frame = new JFrame();
	int sizeX;
	int sizeY;
	//test
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
//		frame.setVisible(true);
	}
	
	public Arena(int width, int height){
//		frame.add(b);
//		enterBot(b);
//		Bot c = new Bot(200,200);
//		c.setStartingPos(width, height);
//		c.setPosition(c.startx, c.starty);
//		frame.add(c);
		setArenaSize(width, height);
		frame.setSize(width, height);
		this.sizeX = width;
		this.sizeY = height;

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	
	public void enterBot(Bot x){
		frame.add(x);
	}
	
	public void setArenaSize(int x, int y){
		this.sizeX=x;
		this.sizeY=y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arena ar = new Arena(900, 700);
//		Bot c = new Bot(100, 100);
		Bot b = new Bot();
		b.setStartingPos(ar.sizeX, ar.sizeY);
		Bot c = new Bot();
		c.setStartingPos(ar.sizeX, ar.sizeY);
		c.setColor(Color.BLUE);
//		ar.enterBot(b);
//		b.repaint();

		ar.start();
		BotThread a = new BotThread(b, ar.frame, ar.sizeX, ar.sizeY);
		a.start();
		BotThread d = new BotThread(c, ar.frame, ar.sizeX, ar.sizeY);
		d.start();

	}

}
