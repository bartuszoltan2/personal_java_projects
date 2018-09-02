package command;

public class RemoteLoader {
	
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		
		
		
		
		
		lightControl(remoteControl);
		
		
	}

	private static void lightControl(RemoteControl remoteControl) {
		Light livingRoomLight = new Light ("Living Room");
		Light kitchenLight = new Light ("Kitchen");
		
		LightOnCommand livingRoomLightOn= new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff= new LightOffCommand(livingRoomLight);
		
		LightOnCommand kitchenLightOn= new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff= new LightOffCommand(kitchenLight);
		
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
	}

}
