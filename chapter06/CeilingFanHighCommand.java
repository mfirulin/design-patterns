public class CeilingFanHighCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed;

	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}

	public void undo() {
		switch (prevSpeed) {
			case CeilingFan.HIGH -> ceilingFan.high();
			case CeilingFan.LOW ->	ceilingFan.low();
			default -> ceilingFan.off();
		}
	}
}
