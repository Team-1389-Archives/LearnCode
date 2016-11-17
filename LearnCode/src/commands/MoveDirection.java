package commands;

import commands.Command;
import sprite.PhysicsSprite;

public class MoveDirection extends Command {
	PhysicsSprite sprite;
	float targetDistance;
	float err;
	float speed;
	float k = 1;
	float target;
	public MoveDirection(PhysicsSprite sprite, float target){
		this.sprite= sprite;
		this.targetDistance=target;
	}
	
	
	//put K for constant
	

	@Override
	protected boolean execute() {
		// TODO Auto-generated method stub
		
		switch(sprite.getDirection()){
		
		case 0:
			err = targetDistance - sprite.getX();
		break;
			
		case 2:
			err = targetDistance - sprite.getX();
		break;
		
		case 1:
			err = targetDistance - sprite.getY();
		break;
		
		case 3:
			err = targetDistance - sprite.getY();
		break;
			
		}
		
		{ speed = k * err;
		sprite.setPower(speed);
		return Math.abs(err) <= 0.5;
		
		
	}




	
		}
	}


