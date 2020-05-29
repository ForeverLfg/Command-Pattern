package Test;

import Basic_class.CeilingFan;
import Basic_class.GarageDoor;
import Basic_class.Light;
import Command_Package.CeilingFanHighCommand;
import Command_Package.CeilingFanMediumCommand;
import Command_Package.Command;
import Command_Package.GarageDoorCloseCommand;
import Command_Package.GarageDoorOpenCommand;
import Command_Package.LightOffCommand;
import Command_Package.LightOnCommand;
import Command_Package.MacroCommand;
import Command_Package.RemoteControlWithUndo;

public class RemoteLeader {
	public static void main(String[] args) {
		
		//动作（命令）的执行方
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		
		Light livingRoomLight = new Light("Living Room");
		Light KitchenLight = new Light("Kitchen");
		GarageDoor garageDoor = new GarageDoor("卧室");
		CeilingFan ceilingFan = new CeilingFan("Linving Room");
		
		
		//创建动作（命令），也就是命令的发起方
		//按钮一
		LightOnCommand  livingRoomLightOn  = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		//按钮二
		LightOnCommand  KitchenLightOn     = new LightOnCommand(KitchenLight);
		LightOffCommand KitchenLightOff    = new LightOffCommand(KitchenLight);
		//按钮三--这个很特殊：分很多档，包括高、中、低和关闭
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
		//按钮四
		GarageDoorOpenCommand garageDoorUp = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorDown = new GarageDoorCloseCommand(garageDoor);
		
		//按钮五--这个很特殊  ： 一键全置
		Command[] partyOn = {livingRoomLightOn,KitchenLightOn,ceilingFanHighCommand, garageDoorUp};
		Command[] partyOff = {livingRoomLightOff,KitchenLightOff,ceilingFanMediumCommand, garageDoorDown};
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		//将命令与相应的按钮配对
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, KitchenLightOn, KitchenLightOff);
		remoteControl.setCommand(2, garageDoorUp, garageDoorDown);
		remoteControl.setCommand(3, ceilingFanHighCommand, ceilingFanMediumCommand);
		remoteControl.setCommand(4, partyOnMacro, partyOffMacro);
		
//		remoteControl.onButtonWasPushed(0);
//		remoteControl.offButtonWasPushed(0);
//		remoteControl.undoButtonWasPushed();
//		
//		remoteControl.onButtonWasPushed(1);
//		remoteControl.offButtonWasPushed(1);
//		remoteControl.undoButtonWasPushed();
//		
//		remoteControl.onButtonWasPushed(2);
//		remoteControl.offButtonWasPushed(2);
//		remoteControl.undoButtonWasPushed();
//		
//		remoteControl.onButtonWasPushed(3);
//		remoteControl.offButtonWasPushed(3);
//		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(5);
		remoteControl.offButtonWasPushed(5);
	}
}
