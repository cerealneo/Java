package sub8;

public class RemoteLg implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("lg-poweron...");
		
	}

	@Override
	public void powerOff() {
		System.out.println("lg-poweroff...");
		
	}

	@Override
	public void chUp() {
		System.out.println("lg-ch up...");
		
	}

	@Override
	public void chDown() {
		System.out.println("lg-ch down...");
		
	}

	@Override
	public void soundUp() {
		System.out.println("lg-soundup...");
		
	}

	@Override
	public void soundDown() {
		System.out.println("lg-sounddown...");
		
	}

}
