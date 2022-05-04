package Learn;

public class AustralianTraffic implements CentralizedTraffic, ContinentalTraffic {
public void handSignal() {
	System.out.println("Walking");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AustralianTraffic at= new AustralianTraffic();
at.stopred();
at.flashYellow();
at.handSignal();
at.goGreen();
	}
	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow Implementation");
	}
	@Override
	public void goGreen() {
		// TODO Auto-generated method stub
		System.out.println("Green implementation");
	}
	@Override
	public void stopred() {
		// TODO Auto-generated method stub
		System.out.println("Red implementation");
	}

}
