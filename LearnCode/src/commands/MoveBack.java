package commands;

import commands.Command;
import sprite.GridSprite;
import sprite.Sprite;

public class MoveBack extends Command {
	GridSprite sprite;
	public MoveBack(GridSprite sprite){
		this.sprite=sprite;
	}
	@Override
	protected boolean execute() {
		// TODO Auto-generated method stub
		switch(sprite.getDirection()){
		
		case 0:
			sprite.setX(sprite.getGridX()-1);
			break;
		
		case 3:
		sprite.setY(sprite.getGridY()-1);
		break;
		
		case 2:
		sprite.setX(sprite.getGridX()+1);
		break;
		
		case 1:
		sprite.setY(sprite.getGridY()+1);
		break;
		
		}
		return sprite.isNearWall();
	}
	

}
