package Command_Package;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for(int i = 0; i < 7; i++) {
			onCommands[i]  = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	//�����������ֱ�Ϊ����۵�λ�á���������ص�����
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot]  = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
}
