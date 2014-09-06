package nanobots;

import javax.swing.JFrame;

public class Arena extends Thread{
	Bot b = new Bot(800,600);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int sizeX;
	int sizeY;
	int maxBots;
	int startBots;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		setSleep();
		b.setStartingPos(sizeX, sizeY);;
		b.repaint();
//		c.repaint();
		setSleep();
		moveBot(b,70, b.pos_x, b.pos_y, 0);
		moveBot(b,70, b.pos_x, b.pos_y, 90);
		moveBot(b,70, b.pos_x, b.pos_y, 180);
		moveBot(b,70, b.pos_x, b.pos_y, 270);


	}
	public Arena(int width, int height){
		JFrame frame = new JFrame();
		frame.add(b);
//		Bot c = new Bot(200,200);
//		c.setStartingPos(width, height);
//		c.setPosition(c.startx, c.starty);
//		frame.add(c);
		frame.setSize(width, height);
		this.sizeX = width;
		this.sizeY = height;
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	

	public void setSleep(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setTick(){
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void moveBot(Bot b, int steps, int posX, int posY, int direction2)
	{
		int i = 0;
		
		switch (direction2)
		{
		case 0:
		{
			for(int j=0;j<steps;j++)
			{
				posY++;
		//		i++;
				
				b.setPosition(posX,posY);
				setTick();
			}
			break;
		}
		case 90:
		{
			while(i<steps)
			{
				posX++;
				i++;
				b.setPosition(posX,posY);
				setTick();
				
			}
			break;
		}
		case 180:
		{
			while(i<steps)
			{
				posY--;
				i++;
				b.setPosition(posX,posY);
				setTick();				
			}
			break;
		}
		case 270:
		{
			while(i<steps)
			{
				posX--;
				i++;
				b.setPosition(posX,posY);
				setTick();
			}
			break;
		}
		default:
		
			break;
		}

		

	}
	public static void main(String[] args) {
		Arena ar = new Arena(800,600);
		ar.start();
//		Bot b = new Bot(800,600);
		//frame.add(ar);
//		frame.add(b);
//		frame.repaint();
//		b.setPosition(100, 200);
	}
}
