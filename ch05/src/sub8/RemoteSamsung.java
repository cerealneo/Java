package sub8;

public class RemoteSamsung implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("samsung-poweron...");
		
	}

	@Override
	public void powerOff() {
		System.out.println("samsung-poweroff...");
		
	}

	@Override
	public void chUp() {
		System.out.println("samsung-ch up...");
		
	}

	@Override
	public void chDown() {
		System.out.println("samsung-ch down...");
		
	}

	@Override
	public void soundUp() {
		System.out.println("samsung-soundup...");
		
	}

	@Override
	public void soundDown() {
		System.out.println("samsung-sounddown...");
		
	}

}
