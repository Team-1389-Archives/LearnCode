package program;
import commands.Command;
import commands.CommandUtils;
import commands.Perimeter;
import commands.TurnRightCommand;
import commands.DoNothingCommand;
import exec.DisplayManager;
import layout.IOHardware;
import programming.Program;
import commands.MoveForwardCommand;
import commands.MoveBack;
import commands.WaitTimeCommand;

public class UserProgram extends Program {
Command Perimeter;

	public void setPeriCommand (){
	Perimeter = CommandUtils.combineSequential((
			new WaitTimeCommand(1000)),
			new MoveForwardCommand(io.robot),
			new WaitTimeCommand(1000),
			new TurnRightCommand(io.robot),
			new WaitTimeCommand(1000),
			new MoveForwardCommand(io.robot),
			new WaitTimeCommand(1000),
			new TurnRightCommand(io.robot),
			new WaitTimeCommand(1000),
			new MoveForwardCommand(io.robot),
			new WaitTimeCommand(1000),
			new TurnRightCommand(io.robot),
			new WaitTimeCommand(1000),
			new MoveForwardCommand(io.robot),
			new WaitTimeCommand(1000),
			new TurnRightCommand(io.robot));
			
			
			

	}

	
	
	@Override
	public Command provideCommand() {
		setPeriCommand();
		
		return Perimeter;
		
	
	}

	// DONT TOUCH THIS
	public void initHardware() {
		Program.io = new IOHardware();
	}

	public static void main(String[] args) {
		Program.setProgram(new UserProgram());
		DisplayManager.openDisplay();
	}

}
