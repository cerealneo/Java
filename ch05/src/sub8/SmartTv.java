package sub8;

public class SmartTv extends Tv implements Computer {

	@Override
	public void boot() {
		System.out.println("스마트 티비 부트");
		
	}

	@Override
	public void internet() {
		System.out.println("스마트 티비 internet ");
		
	}
	
	public void process() {
		poweron();
		boot();
		internet();
	}

}
