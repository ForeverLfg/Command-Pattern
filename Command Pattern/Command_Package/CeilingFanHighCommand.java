package Command_Package;

import Basic_class.CeilingFan;

public class CeilingFanHighCommand implements Command{

	CeilingFan ceilingFan;
	int preSpeed;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		preSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		if(preSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		}else if(preSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		}else if(preSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		}else if(preSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}

}
