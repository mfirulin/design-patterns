public class Main {
    public static void main(String[] args) {
        var remoteControl = new RemoteControl();

        // Create services
        var light = new Light("Living Room");
        var fan = new CeilingFan("Living Room");
    
        // Create commands
        var lightOn = new LightOnCommand(light);
        var lightOff = new LightOffCommand(light);
        var fanHigh = new CeilingFanHighCommand(fan);
        var fanLow = new CeilingFanLowCommand(fan);
        var fanOff = new CeilingFanOffCommand(fan);

        // Create macro command
        Command[] macroOnCommands = { lightOn, fanHigh };
		Command[] macroOffCommands = { lightOff, fanOff };
		var macroOn = new MacroCommand(macroOnCommands);
		var macroOff = new MacroCommand(macroOffCommands);

        // Set up Remote Control
        remoteControl.setCommand(0, lightOn, lightOff);
        remoteControl.setCommand(1, fanLow, fanOff);
        remoteControl.setCommand(2, fanHigh, fanOff);
        remoteControl.setCommand(3, macroOn, macroOff);

        // Execution
        System.out.println(remoteControl);
		System.out.println("--- Pushing Light On---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Light Off---");
		remoteControl.offButtonWasPushed(0);
        System.out.println("--- Pushing Fan On Low---");
		remoteControl.onButtonWasPushed(1);
        System.out.println("--- Pushing Fan On High---");
		remoteControl.onButtonWasPushed(2);
		System.out.println("--- Pushing Fan Off---");
		remoteControl.offButtonWasPushed(1);
        System.out.println("--- Pushing Macro On---");
		remoteControl.onButtonWasPushed(3);
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonWasPushed(3);
    }
}
