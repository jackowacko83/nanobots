package nanobots;

public class BotMovement {
	BotThread bt;
	Bot bot;
	int arenaX;
	int arenaY;
	double posX;
	double posY;
	double direct;
	
	public BotMovement(){
		
	}
	
	public BotMovement(BotThread bth){
		this.bt=bth;
		this.bot=bth.bot;
		this.posX=bot.pos_x;
		this.posY=bot.pos_y;
		this.direct=bot.direction;
	}
	
	public void turn(double dir){
		this.direct = (this.direct + dir)%360;
		bot.setDirection(this.direct);
//		System.out.println(this.direct + " " + bot.direction);
	}
	
	public void setDirection(double dir){
		bot.setDirection(dir);
	}
	
	public void move3(int steps){
		for(int i=0;i<steps;i++){
			this.posY = this.posY - Math.cos(Math.toRadians(this.direct));
			this.posX = this.posX + Math.sin(Math.toRadians(this.direct));
//			System.out.println(this.posX + " ; "+ this.posY+ " ; "+ bt.sizeX+ " ; "+ bt.sizeY);
			
			if(this.posX<0){this.posX=0;}
			if(this.posX>bt.sizeX-bot.size){this.posX=bt.sizeX-bot.size-1;bot.setPosition(this.posX, this.posY);
			bt.setTick();break;}
			if(this.posY<0){this.posY=0;break;}
			if(this.posY>bt.sizeY-bot.size){this.posY=bt.sizeY-bot.size-1;bot.setPosition(this.posX, this.posY);
			bt.setTick();break;}

			bot.setPosition(this.posX, this.posY);
			bt.setTick();
		}
//		System.out.println(this.posX + " ; "+ this.posY);
//		System.out.println(this.direct + " ; sin: "+ Math.sin(Math.toRadians(this.direct)) + " ; cos: " + Math.cos(Math.toRadians(this.direct)));
	}
	
	public void move(int steps, int dir){
		int i = 0;
		
		switch (dir)
		{
		case 0:
		{
			for(int j=0;j<steps;j++)
			{
				posY++;
		//		i++;
				
				bot.setPosition(posX,posY);
				bt.setTick();
			}
			break;
		}
		case 90:
		{
			while(i<steps)
			{
				posX++;
				i++;
				bot.setPosition(posX,posY);
				bt.setTick();
				
			}
			break;
		}
		case 180:
		{
			while(i<steps)
			{
				posY--;
				i++;
				bot.setPosition(posX,posY);
				bt.setTick();				
			}
			break;
		}
		case 270:
		{
			while(i<steps)
			{
				posX--;
				i++;
				bot.setPosition(posX,posY);
				bt.setTick();
			}
			break;
		}
		default:
		
			break;
		}
		
	}

}
