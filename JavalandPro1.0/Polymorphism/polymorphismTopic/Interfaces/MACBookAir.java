package polymorphismTopic.Interfaces;

public class MACBookAir extends MACBook {

	@Override
	public void start() {
		System.out.println("Inside MACBookAir start method");
	}

	@Override
	public void shutdown() {
		System.out.println("Inside MACBookAir shutdown method");
	}
	
	

}
