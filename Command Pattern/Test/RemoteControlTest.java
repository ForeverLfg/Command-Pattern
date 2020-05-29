//package Test;
//
//import Basic_class.GarageDoor;
//import Basic_class.Light;
//import Command_Package.Command;
//import Command_Package.GarageDoorOpenCommand;
//import Command_Package.LightOnCommand;
//import Command_Package.SimpleRemoteControl;
//
//public class RemoteControlTest {
//	public static void main(String[] args) {
//		
//		//Command slot;
//		SimpleRemoteControl remote = new SimpleRemoteControl();
//		
//		Light light = new Light("1");
//		GarageDoor garageDoor = new GarageDoor();
//		
//		//implements Command
//		//@Override
//		//public void execute()
//		LightOnCommand lighton = new LightOnCommand(light);
//		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
//		
//		
//	
//		remote.setCommand(lighton);
//		remote.buttonWasPressed();
//		remote.setCommand(garageDoorOpen);
//		remote.buttonWasPressed();
//	}
//}
//
