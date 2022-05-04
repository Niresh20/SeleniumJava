package Learn;

public class ChildEmirates extends ParentAircraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildEmirates ce=new ChildEmirates();
ce.safetyGuidelines();
ce.engineRules();
ce.aircraftColor();
	}

	@Override
	public void aircraftColor() {
		// TODO Auto-generated method stub
		System.out.println("Yellow in color");
	}

}
