package commands;

import commands.Command;
import sprite.PhysicsSprite;

public class MoveDirection extends Command {
	PhysicsSprite sprite;
	public MoveDirection(PhysicsSprite sprite){
		this.sprite= sprite;
	}
	
	float targetDistance = 6;
	

	@Override
	protected boolean execute() {
		// TODO Auto-generated method stub
		
		switch(sprite.getDirection()){
		
		case 0:
			error(targetDistance - sprite.getX());
		break;
			
		case 2:
			error(targetDistance - Math.abs(sprite.getX()));
		break;
		
		case 1:
			error(targetDistance - sprite.getY());
		break;
		
		case 3:
			error(targetDistance - Math.abs(sprite.getY()));
		break;
			
		}
		
		
		
		return false;
	}


	private void error(float f) {
		// TODO Auto-generated method stub
		
	}
	
}


