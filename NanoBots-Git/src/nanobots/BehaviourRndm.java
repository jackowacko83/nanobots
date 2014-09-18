package nanobots;

public class BehaviourRndm {
	int otherX;
	int otherY;
	public BehaviourRndm(BotThread bt){
		BotMovement move = new BotMovement(bt);
		move.setDirection(90);
		
//		while(true){
//			move.turn(Math.random()*360);
//			move.move3((int)(Math.random()*100));
//		}
		
		while(true){
			move.turn(12);
			move.move3(100);
		}
	}
}
