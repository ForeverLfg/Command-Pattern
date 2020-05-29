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
		
		//�����������ִ�з�
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		
		Light livingRoomLight = new Light("Living Room");
		Light KitchenLight = new Light("Kitchen");
		GarageDoor garageDoor = new GarageDoor("����");
		CeilingFan ceilingFan = new CeilingFan("Linving Room");
		
		
		//���������������Ҳ��������ķ���
		//��ťһ
		LightOnCommand  livingRoomLightOn  = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		//��ť��
		LightOnCommand  KitchenLightOn     = new LightOnCommand(KitchenLight);
		LightOffCommand KitchenLightOff    = new LightOffCommand(KitchenLight);
		//��ť��--��������⣺�ֺܶ൵�������ߡ��С��ͺ͹ر�
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
		//��ť��
		GarageDoorOpenCommand garageDoorUp = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorDown = new GarageDoorCloseCommand(garageDoor);
		
		//��ť��--���������  �� һ��ȫ��
		Command[] partyOn = {livingRoomLightOn,KitchenLightOn,ceilingFanHighCommand, garageDoorUp};
		Command[] partyOff = {livingRoomLightOff,KitchenLightOff,ceilingFanMediumCommand, garageDoorDown};
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		//����������Ӧ�İ�ť���
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
