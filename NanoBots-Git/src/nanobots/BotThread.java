package nanobots;

import javax.swing.JFrame;

public class BotThread extends Thread{
	JFrame frame = new JFrame();
	Bot bot;
	int sizeX;
	int sizeY;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		frame.add(bot);
		frame.setVisible(true);
		bot.repaint();
		BotMovement move = new BotMovement(this);
		move.setDirection(90);
		
		while(true){
			move.turn(12);
			move.move3(90);
		}
/*
		move.move3(170);
		move.turn(90);
		move.move3(500);
		move.turn(90);
		move.move3(170);
		move.turn(90);
		move.move3(500);
		move.turn(90);

*/
		/*
		move.move(170, 0);
		move.move(170, 90);
		move.move(170, 180);
		move.move(170, 270);*/
	}
	
	public BotThread(Bot x, JFrame fr,int arenax, int arenay){
		this.bot=x;
		this.frame=fr;
		this.sizeX=fr.getWidth();
		this.sizeY=fr.getHeight();
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
	
}
