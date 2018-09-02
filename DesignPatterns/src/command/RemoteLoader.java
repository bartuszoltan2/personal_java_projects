package command;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		// fanControl(remoteControl);

//		 lightControl(remoteControl);

		// macroControl(remoteControl);
		
		
		
		Light livingRoomLight = new Light ("Living Room");
//		remoteControl.setCommand(0, ()->{livingRoomLight.on();}, ()->{livingRoomLight.off();});
		
		remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
		
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		
	}

	private static void macroControl(RemoteControl remoteControl) {
		Light light = new Light("Living room");
		TV tv = new TV("Living room");
		Stereo stereo = new Stereo("Living room");

		LightOnCommand lightOn = new LightOnCommand(light);
		TVOnCommand tvOn = new TVOnCommand(tv);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);

		LightOffCommand lightOff = new LightOffCommand(light);
		TVOffCommand tvOff = new TVOffCommand(tv);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);

		Command[] partyOn = { lightOn, stereoOn, tvOn };
		Command[] partyOff = { lightOff, stereoOff, tvOff };

		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);

		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

		System.out.println("--Pushing Macro On--");
		remoteControl.onButtonWasPushed(0);
		System.out.println(remoteControl);
		System.out.println("--Pushing Macro Off--");
		remoteControl.undoButtonWasPushed();
		// remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);

	}

	private static void fanControl(RemoteControl remoteControl) {
		CeilingFan ceilingFan = new CeilingFan("Living Room");

		CeilingFanMediumCommand ceilingMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		remoteControl.setCommand(0, ceilingMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingHigh, ceilingFanOff);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();

		remoteControl.onButtonWasPushed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
	}

	private static void lightControl(RemoteControl remoteControl) {
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

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
