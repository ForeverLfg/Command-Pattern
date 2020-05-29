package Command_Package;

import Basic_class.GarageDoor;

public class GarageDoorOpenCommand implements Command{

	GarageDoor garage;
	
	public GarageDoorOpenCommand(GarageDoor garage) {
		this.garage = garage;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garage.up();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		garage.close();
	}

}
